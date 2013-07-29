package Proxy;

/**
 * Proxy pattern chỉ cho ta cách giao tiếp giữa client với server dùng socket.
 * Client vẫn có các hàm cần thiết(nó tưởng nó đang làm việc với object thực).
 * Client gửi mesage đến server và nhận kết quả.
 * 
 * First: Start AutomatServer
 * Seconds: Run test class
 * @author long-nguyen
 *
 */
public class TestClass {
	
	AutomatProxy proxy;
	

	
	public static void main(String []args){
		new TestClass();
	}

	public TestClass(){
		/**Unscalable ways(means taking lots of effort when adding new state to rentalmethod class 
		rentalsMethod=new RentalMethods(9);
		rentalsMethod.getApplication();
		rentalsMethod.checkApplication(); 
		*/
		
		//Test function
		proxy=new AutomatProxy();
		proxy.gotApplication();
		proxy.checkApplication();
		proxy.rentApartment();
	}
	
}
