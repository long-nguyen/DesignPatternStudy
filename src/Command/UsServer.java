package Command;

public class UsServer implements IReceiver{

	public UsServer(){
		
	}
	
	
	@Override
	public void connect() {
		System.out.println("You’re connected to the US server.");
	}

	@Override
	public void diagnostics() {
		System.out.println("The US server diag is ok.");
	}

	@Override
	public void reboot() {
		System.out.println("Reboot US server");
	}

	@Override
	public void shutdown() {
		System.out.println("Shut down US server");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from US server");
	}

}
