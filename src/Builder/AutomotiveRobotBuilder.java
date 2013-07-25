package Builder;

import java.util.ArrayList;

public class AutomotiveRobotBuilder extends RobotBuilder{

	public AutomotiveRobotBuilder(){
		robot=new AutomotiveRobotBuildable();
		actions=new ArrayList<Integer>();
	}
	
	private static final class AutomotiveRobotBuildable implements IRobotBuildable {

		ArrayList<Integer> actions;

		@Override
		public void go() {
			for (Integer i : actions) {
				switch (i) {
				case 1:
					start();
					break;
				case 2:
					getParts();
					break;
				case 3:
					assemble();
					break;
				case 4:
					test();
					break;
				case 5:
					stop();
					break;
				default:
					break;
				}
			}
		}

		public void loadAction(ArrayList<Integer> a) {
			actions = a;
		}

		public void start() {
			System.out.println("Starting....");
		}

		public void getParts() {
			System.out.println("Getting components..");
		}

		public void assemble() {
			System.out.println("Combining components....");
		}

		public void test() {
			System.out.println("Running the auto robot.");
		}

		public void stop() {
			System.out.println("Stopping....");
		}
	}

}
