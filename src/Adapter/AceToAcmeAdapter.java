package Adapter;

public class AceToAcmeAdapter implements IAcme{

	AceClass aceObj;
	String firstName;
	String lastName;
	
	public AceToAcmeAdapter(AceClass a){
		aceObj=a;
		firstName=aceObj.getName().split(" ")[0];
		lastName=aceObj.getName().split(" ")[1];
	}
	
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
