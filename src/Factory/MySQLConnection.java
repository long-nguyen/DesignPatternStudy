package Factory;

public class MySQLConnection extends Connection{

	static{
		NormalFactory.registerConnection("MySQL", MySQLConnection.class);
	}
	
	public MySQLConnection(){
		
	}
	
	public String description(){
		return "MySQL";
	}

}
