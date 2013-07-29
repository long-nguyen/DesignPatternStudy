package Proxy;

public class FullyRentedState implements IState {

	IAutomat automat;
	
	public FullyRentedState(AutomatServer a) {
		automat=a;
	}

	@Override
	public String gotApplication() {
		return "Sorry, we're fully rented";
	}

	@Override
	public String checkAppication() {
		return "Sorry, we're fully rented";
	}

	@Override
	public String rentApartment() {
		return "Sorry, we're fully rented";
	}

	@Override
	public String dispensekeys() {
		return "Sorry, we're fully rented";
	}

}
