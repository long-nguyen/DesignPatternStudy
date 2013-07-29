package State;

public class WaitingState implements State {

	IAutomat automat;
	
	public WaitingState(Automat automat) {
		this.automat=automat;
	}

	@Override
	public String gotApplication() {
		automat.setState(automat.getGotApplicationState());
		return "Thansk for the application";
	}

	@Override
	public String checkAppication() {
		return "You have to submit an application";
	}

	@Override
	public String rentApartment() {
		return "You have to submit an application";
	}

	@Override
	public String dispensekeys() {
		return "You have to submit an application";
	}

}
