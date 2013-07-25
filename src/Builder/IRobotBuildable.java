package Builder;

import java.util.ArrayList;

public interface IRobotBuildable {
	public void go();
	public void loadAction(ArrayList<Integer> a);
	public void start();
	public void getParts();
	public void assemble();
	public void test();
	public void stop();
}
