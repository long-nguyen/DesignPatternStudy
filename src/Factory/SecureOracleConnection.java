package Factory;

public class SecureOracleConnection extends Connection{
	static{
		SecureFactory.registerConnection("Oracle", SecureOracleConnection.class);
	}
	public SecureOracleConnection(){
		
	}
	public String description(){
		return "Secure Oracle";
	}

}
