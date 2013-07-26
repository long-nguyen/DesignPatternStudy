package Iterator;

public class Division {
	
	private String name;
	private int number=0;
	private VP[] VPs=new VP[100];
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void add(String n){
		VP vp=new VP(n, name);
		VPs[number++]=vp;
	}

	public DivisionIterator iterator(){
		return new DivisionIterator(VPs);
	}

	public Division(String n){
		name=n;
	}
}
