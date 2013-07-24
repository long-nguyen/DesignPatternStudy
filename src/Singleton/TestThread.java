package Singleton;
/**
 * Remember, runnable is not a thread, it is just some piece of code to run
 * @author long-nguyen
 *
 */
public  class TestThread extends Thread{
	
	String name;
	public TestThread(String databaseName){
		name=databaseName;
	}
	@Override
	public void run() {
		/*Test asynchronized
		Database database=Database.getInstance(name); 
		*/
		/*Test synchronized
		DatabaseSynchronized database=DatabaseSynchronized.getInstance(name);
		 */
		DatabaseThreaded database=DatabaseThreaded.getInstance(name);
		System.out.println(database.getName());
	}
}