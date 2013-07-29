package State;

public class WaitingState implements IState {

	IAutomat automat;
	
	public WaitingState(IAutomat automat) {
		this.automat=automat;
	}

	@Override
	public String gotApplication() {
		automat.setState(new GotApplicationState(automat));
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
