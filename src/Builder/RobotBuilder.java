package Builder;

import java.util.ArrayList;


public abstract class RobotBuilder {

	protected IRobotBuildable robot;
	protected ArrayList<Integer> actions;
	
	
	public RobotBuilder addStart()
	{
		actions.add(new Integer(1)); 
		return this;
	}
	public RobotBuilder addGetParts()
	{
		actions.add(new Integer(2)); 
		return this;
	}
	public RobotBuilder addAssemble()
	{
		actions.add(new Integer(3)); 
		return this;
	}
	public RobotBuilder addTest()
	{
		actions.add(new Integer(4)); 
		return this;
	}
	public RobotBuilder addStop()
	{
		actions.add(new Integer(5)); 
		return this;
	}

	public IRobotBuildable getRobot() {
		robot.loadAction(actions);
		return robot;
	}
	

}
