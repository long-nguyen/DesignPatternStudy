package State;

import java.util.Random;

public class GotApplicationState implements State {

	IAutomat automat;
	Random random;
	
	public GotApplicationState(Automat a) {
		automat=a;
		random=new Random(System.currentTimeMillis());
	}

	@Override
	public String gotApplication() {
		return "We already got your application!";
	}

	@Override
	public String checkAppication() {
		int yesno=random.nextInt() %10;
		if(yesno>4&&automat.getCount()>0){
			automat.setState(automat.getApartmentRentedState());
			return "Congratulation, you were approved";
		}else{
			automat.setState(automat.getWaitingState());
			return "Sorry, you were not approved!";
		}
	}

	@Override
	public String rentApartment() {
		return "You must have your application checked";
	}

	@Override
	public String dispensekeys() {
		return "You must have your application checked";
	}

}
