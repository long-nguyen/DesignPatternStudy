package Factory;


public class SecureFactory implements IFactory{

	@Override
	public Connection createConnection(String type) {
		if("Oracle".equals(type)){
			return new SecureOracleConnection();
		}else if("SQL Server".equals(type)){
			return new SecureSQLServerConnection();
		}else{
			return new SecureMySQLConnection();
		}
	}


}
