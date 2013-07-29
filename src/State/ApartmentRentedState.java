package State;

public class ApartmentRentedState implements IState {

	IAutomat automat;
	
	public ApartmentRentedState(IAutomat a) {
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
			automat.setState(new ApartmentRentedState(automat));
		}else {
			automat.setState(new WaitingState(automat));
		}
		return "Here are your keys!";
	}

}
