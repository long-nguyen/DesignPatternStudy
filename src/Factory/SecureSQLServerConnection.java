package Factory;

public class SecureSQLServerConnection extends Connection{
	static{
		SecureFactory.registerConnection("SQL Server", SecureSQLServerConnection.class);
	}
	public SecureSQLServerConnection(){
		
	}
	public String description(){
		return "SQL Server";
	}

}
