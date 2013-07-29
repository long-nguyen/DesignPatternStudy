package Command;

public class ShutDownCommand implements ICommand{

	IReceiver receiver;
	
	public ShutDownCommand(IReceiver r){
		receiver=r;
	}
	
	@Override
	public void execute() {
		receiver.connect();
		receiver.shutdown();			//because this command is for testing shutdown, 
		receiver.disconnect();
		System.out.println();
	}

	@Override
	public void undo() {
		System.out.println("Undoing...");
		receiver.connect();
		receiver.reboot();
		receiver.disconnect();
		System.out.println();
	}

}
