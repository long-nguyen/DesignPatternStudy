package Factory;


public class TestClass {

	
	public static void main(String[] args) {
		Connection con=NormalFactory.createConnection("Oracle");
		System.out.println(con.description());
		
		Connection con2=SecureFactory.createConnection("Oracle");
		System.out.println(con2.description());
	}
	
	 

}
