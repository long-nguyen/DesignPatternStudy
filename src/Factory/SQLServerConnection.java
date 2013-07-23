package Factory;

public class SQLServerConnection extends Connection{
	static{
		NormalFactory.registerConnection("SQL Server", SQLServerConnection.class);
	}
	public SQLServerConnection(){
		
	}
	public String description(){
		return "Secure SQL Server";
	}

}
