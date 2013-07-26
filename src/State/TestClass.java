package State;

/**
 * State design pattern: Allow an object to alter its behaviour when its internal state changes.
 * The object wil apperare to change its class.
 * 
 * Thông thường khi bạn tham gia vào 1 dự án lớn, mã nguồn thường tối tăm và có quá nhiều điều kiện có thể xảy ra mà bạn phải nắm bắt
 * và khó biết đâu là các ranh giới, làm sao để chia nhỏ mã nguồn.
 * Gợi ý là chia thành các trạng thái khác nhau và rời rạc từng phần.
 * 
 * @author long-nguyen
 *
 */
public class TestClass {
	
	public static void main(String []args){
		new TestClass();
	}

	public TestClass(){
		rentalsMethod=new RentalMethods(9);
		rentalsMethod.getApplication();
		rentalsMethod.checkApplication();
	}
	RentalMethods rentalsMethod;
}
