package Decorator;

public abstract class ComputerDecorator extends Computer{
	protected Computer comp;
	public abstract String description();
}
