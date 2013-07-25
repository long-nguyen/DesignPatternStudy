package Builder;

import java.util.ArrayList;

public class CookieRobotBuilder extends RobotBuilder{

	public CookieRobotBuilder(){
		robot=new CookieRobotBuildable();
		actions=new ArrayList<Integer>();
	}
	
	private static final class CookieRobotBuildable implements IRobotBuildable {

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
			System.out.println("Getting flour and surgar");
		}

		public void assemble() {
			System.out.println("Baking a cookie....");
		}

		public void test() {
			System.out.println("Crunching a cookie.");
		}

		public void stop() {
			System.out.println("Stopping....");
		}
	}

}
