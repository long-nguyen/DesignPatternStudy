package TemplateMethod;

public abstract class RobotTemplate {

	public final void go(){
		start();
		getParts();
		assemble();
		if(isOk()){
			test();
		}
		stop();
	}
	
	public void start(){
		System.out.println("Starting...");
	}
	
	public void getParts(){
		System.out.println("Getting ...");
	}
	
	public void assemble(){
		System.out.println("Assembling ...");
	}
	
	public void test(){
		System.out.println("Testing the engine...");
	}
	
	public void stop(){
		System.out.println("Stopping...");
	}

	/**
	 * Hook
	 * @return
	 */
	public boolean isOk(){
		return true;
	}
}
