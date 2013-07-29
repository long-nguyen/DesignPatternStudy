package Command;

public class AsiaServer implements IReceiver{

	public AsiaServer(){
		
	}
	
	
	@Override
	public void connect() {
		System.out.println("You’re connected to the Asia server.");
	}

	@Override
	public void diagnostics() {
		System.out.println("The asia server diag is ok.");
	}

	@Override
	public void reboot() {
		System.out.println("Reboot asia server");
	}

	@Override
	public void shutdown() {
		System.out.println("Shut down asia server");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from asia server");
	}

}
