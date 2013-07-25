package TemplateMethod;

public class AutomotiveRobo extends RobotTemplate {

	private String name;
	public AutomotiveRobo(String n) {
		name=n;
	}

	/**
	 * Customize 3 functions
	 */
	public void getParts()
	{
		System.out.println("Getting a carburetor....");
	}

	public void assemble()
	{
		System.out.println("Installing the carburetor....");
	}

	public void test()
	{
		System.out.println("Revving the engine....");
	}
	
	public String getName(){
		return name;
	}
}
