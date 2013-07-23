package Factory;

public class OracleConnection extends Connection{

	static{
		NormalFactory.registerConnection("Oracle", OracleConnection.class);
	}
	public OracleConnection(){
		
	}
	public String description(){
		return "Oracle";
	}

}
