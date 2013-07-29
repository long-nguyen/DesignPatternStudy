package State;

public class ApartmentRentedState implements State {

	IAutomat automat;
	
	public ApartmentRentedState(Automat a) {
		automat=a;
	}

	@Override
	public String gotApplication() {
		return "Hang on, we are renting you an apartment";
	}

	@Override
	public String checkAppication() {
		return "Hang on, we are renting you an apartment";
	}

	@Override
	public String rentApartment() {
		automat.setCount(automat.getCount()-1);
		return "Renting you an apartment";
	}

	@Override
	public String dispensekeys() {
		if(automat.getCount()<=0){
			automat.setState(automat.getFullyRentedState());
		}else {
			automat.setState(automat.getWaitingState());
		}
		return "Here are your keys!";
	}

}
