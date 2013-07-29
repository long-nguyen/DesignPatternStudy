package State;

/**
 * Class này quản lý state, chỉ duy nhất đối tượng state là liên quan đến State pattern mà thôi, 
 * còn lại đều là hàm cho người dùng sử dụng
 * @author long-nguyen
 *
 */

public class Automat implements IAutomat{

	private IState state;	//now state
	int count;				//number of apartment

	public Automat(int n){
		count=n;
		state=new WaitingState(this);
	}
	
	//Got application, checkApplication, rentApartment là hàm cho người dùng làm việc, ko liên quan đến Pattern
	@Override
	public void gotApplication() {
		System.out.println(state.gotApplication());
	}

	@Override
	public void checkApplication() {
		System.out.println(state.checkAppication());
	}

	@Override
	public void rentApartment() {
		System.out.println(state.rentApartment());
		System.out.println(state.dispensekeys());
	}

	@Override
	public void setState(IState s) {
		 state=s;
	}
	
	public IState getState(){
		return state;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setCount(int n) {
		count=n;
	}
	

}
