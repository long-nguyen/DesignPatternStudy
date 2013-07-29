package Command;

public class RunDiagnosticsCommand implements ICommand{

	IReceiver receiver;
	
	public RunDiagnosticsCommand(IReceiver r){
		receiver=r;
	}
	
	@Override
	public void execute() {
		receiver.connect();
		receiver.diagnostics();
		receiver.disconnect(); //because this command is for testing diagnotis, 
		System.out.println();
	}

	@Override
	public void undo() {
		System.out.println("can not undo...");
		System.out.println();
	}

}
