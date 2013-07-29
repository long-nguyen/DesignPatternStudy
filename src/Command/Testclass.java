package Command;

/**
 * Encapsulate actions into a object, user just run this object and automatically run command
 * @author long-nguyen
 *
 */

public class Testclass {

	public static void main(String[] args){
		new Testclass();
	}
	
	public Testclass(){
		Invoker iv=new Invoker();
		AsiaServer asiaServer=new AsiaServer();
		EuroServer euroServer=new EuroServer();
		ShutDownCommand shutdownAsia=new ShutDownCommand(asiaServer);
		
		RunDiagnosticsCommand diagEuro=new RunDiagnosticsCommand(euroServer);
		
		iv.setCommand(diagEuro);
		iv.run();
		
		iv.setCommand(shutdownAsia);
		iv.run();
		
		iv.undo();
		iv.undo();
	}
}
