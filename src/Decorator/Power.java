package Decorator;

public class Power extends ComputerDecorator {

	/*
	 * The disk is the decorator of computer, it add new feature to description functionu
	 */
	Computer comp;
	public Power(Computer computer){
		comp=computer;
	}
	@Override
	public String description() {
		return comp.description()+" and a Power";
	}

}
