package ChainOfResponsibility;

public class Application implements IHelp{
	
	
	@Override
	public void getHelp(int helpConstant) {
		System.out.print("I am application layer , I will help");
	}

}
