package State;

/**
 * State design pattern: Allow an object to alter its behaviour when its internal state changes.
 * The object wil apperare to change its class.
 * 
 * 
 * How to understand State pattern:
 * + Mỗi state là 1 class, tự nó biết phải ứng xử như thế nào khi gặp các input khác nhau
 * + Automat và IAutomat là đối tượng cần quản lý, nó chứa state(state này được thay đổi tự động bởi các state class khác)
 * 
 * Bây giờ, automat ko cần phải sửa gì cả mỗi khi thêm state, chỉ có các state tự nó phải thay đổi sao cho thích ứng.
 * Ta chỉ cần thêm 1 function vào IState  interface thì bọn kia buộc phải thay đổi. 
 * Như vậy dễ dàng hơn khi khách hàng chỉ cần làm việc với Automat function( bằng cách gọi các hàm thuê nhà, gửi đơn...) mà chúng ta ko cần phải sửa Automat
 * 
 * @author long-nguyen
 *
 */
public class TestClass {
	
	Automat automat;
	RentalMethods rentalsMethod;

	
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
		automat=new Automat(9);
		automat.gotApplication();
		automat.checkApplication();
		automat.rentApartment();
	}
	
}
