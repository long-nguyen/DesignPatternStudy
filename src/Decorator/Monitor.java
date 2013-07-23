package Decorator;

public class Monitor extends ComputerDecorator {

	/*
	 * The disk is the decorator of computer, it add new feature to description functionu
	 */
	Computer comp;
	public Monitor(Computer computer){
		comp=computer;
	}
	@Override
	public String description() {
		return comp.description()+" and a Monitor";
	}

}
