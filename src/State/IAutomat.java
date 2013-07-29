package State;

public interface IAutomat {

	public void gotApplication();
	public void checkApplication();
	public void rentApartment();
	public State setState(State s);
	public State getWaitingState();
	public State getGotApplicationState();
	public State getApartmentRentedState();
	public State getFullyRentedState();
	public int getCount();
	public void setCount(int n);
}
