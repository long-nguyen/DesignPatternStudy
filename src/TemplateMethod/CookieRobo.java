package TemplateMethod;

public class CookieRobo extends RobotTemplate {

	private String name;
	public CookieRobo(String n) {
		name=n;
	}

	/**
	 * Customize 3 functions
	 */
	public void getParts()
	{
		System.out.println("Getting a flour and sugar....");
	}

	public void assemble()
	{
		System.out.println("Baking a cookie...");
	}

	public void test()
	{
		System.out.println("Crunching the cookie....");
	}
	
	public String getName(){
		return name;
	}
}
