package Factory;

public class SecureMySQLConnection extends Connection{
	static{
		SecureFactory.registerConnection("MySQL", SecureMySQLConnection.class);
	}
	public SecureMySQLConnection(){
		
	}
	
	public String description(){
		return "MySQL";
	}

}
