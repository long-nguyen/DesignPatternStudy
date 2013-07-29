package Command;

public class EuroServer implements IReceiver{

	public EuroServer(){
		
	}
	
	
	@Override
	public void connect() {
		System.out.println("You’re connected to the Euro server.");
	}

	@Override
	public void diagnostics() {
		System.out.println("The Euro server diag is ok.");
	}

	@Override
	public void reboot() {
		System.out.println("Reboot Euro server");
	}

	@Override
	public void shutdown() {
		System.out.println("Shut down Euro server");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from Euro server");
	}

}
