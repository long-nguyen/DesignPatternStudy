package Factory;


public class TestClass {

	/**
	 * Mục đích là tạo ra 1 nhà máy sản xuất đối tượng, với các đầu vào khác nhau sẽ cho ra đối tượng khác nhau
	 * An abstract factory provides an interface for creating families of related objects without specifying their concrete classes
	 * Ta có 2 nhà máy để tạo ra các connection, 2 nhà máy này kế thừa IFactory.	
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con=new NormalFactory().createConnection("Oracle");
		System.out.println(con.description());
		
		Connection con2=new SecureFactory().createConnection("Oracle");
		System.out.println(con2.description());
	}
	
	 

}
