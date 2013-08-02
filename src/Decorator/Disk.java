package Decorator;

public class Disk extends ComputerDecorator {

	/*
	 * The disk is the decorator of computer, it add new feature to description functionu
	 */
	public Disk(Computer computer){
		comp=computer;
	}
	@Override
	public String description() {
		return comp.description()+" and a disk";
	}

}
