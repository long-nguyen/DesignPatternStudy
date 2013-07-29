package Command;

public interface IReceiver {

	public void connect();
	public void diagnostics();
	public void reboot();
	public void shutdown();
	public void disconnect();
}
