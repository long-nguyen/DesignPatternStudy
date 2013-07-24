package Adapter;

public class AceClass implements IAce{

	String name;
	@Override
	public void setName(String n) {
		this.name=n;
	}

	@Override
	public String getName() {
		return name;
	}

}
