package Adapter;

public class AcmeClass implements IAcme{

	String firstName;
	String lastName;
	
	@Override
	public void setFirstName(String fn) {
		firstName=fn;
	}

	@Override
	public void setLastName(String ln) {
		lastName=ln;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

}
