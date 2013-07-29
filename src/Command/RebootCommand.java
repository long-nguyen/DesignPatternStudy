package Command;

public class RebootCommand implements ICommand{

	IReceiver receiver;
	
	public RebootCommand(IReceiver r){
		receiver=r;
	}
	
	@Override
	public void execute() {
		receiver.connect();
		receiver.reboot();
		receiver.disconnect(); //because this command is for testing diagnotis, 
		System.out.println();
	}

	@Override
	public void undo() {
		System.out.println("Undoing...");
		receiver.connect();
		receiver.shutdown();
		receiver.disconnect();
		System.out.println();
	}
}
