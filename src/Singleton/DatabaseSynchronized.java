package Singleton;

public class DatabaseSynchronized {
	
	private static DatabaseSynchronized singleObject;
	private int record;
	private String name;
	
	private DatabaseSynchronized(String n){
		name=n;
		record=0;
	}
	//Synchronization keyword cost time, slowdown significantly because thread need to be constantly monitored

	public static synchronized DatabaseSynchronized getInstance(String n){
		if(singleObject==null) {
			singleObject=new DatabaseSynchronized(n);
		}
		return singleObject;
	}
	
	public void editRecord(String op){
		System.out.print("Performing a "+op+" on a record"+record+" in database "+name);
	}

	public String getName() {
		return name;
	}

}
