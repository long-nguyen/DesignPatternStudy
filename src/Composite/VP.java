package Composite;


public class VP extends Corporate{
	
	private String name;
	private String division;
	
	public VP(String n,String d){
		name=n;
		division=d;
	}
	public String getName(){
		return name;
	}
	
	@Override public void print(){
		System.out.println("Name:"+name+" division:"+division);
	}
	
}
