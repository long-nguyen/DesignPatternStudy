package Factory;

public class NormalFactory implements IFactory{

	@Override
	public  Connection createConnection(String type) {
		if("Oracle".equals(type)){
			return new OracleConnection();
		}else if("SQL Server".equals(type)){
			return new SQLServerConnection();
		}else{
			return new MySQLConnection();
		}
	}
}
