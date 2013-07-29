package State;

//This is the interface for declaring automat's function, not related to State pattern.
public interface IAutomat {

	public void gotApplication();
	public void checkApplication();
	public void rentApartment();
	public void setState(IState s);
	public IState getState();
	public int getCount();
	public void setCount(int n);
}
