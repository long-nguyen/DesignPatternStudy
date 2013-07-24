package Singleton;

public class Database {

	private static Database singleObject;
	private int record;
	private String name;
	
	//Create a private contructor so there would be no usable "new" keyword
	private Database(String n){
		name=n;
		record=0;
	}

	public static Database getInstance(String n){
		//Here, if there are 2 thread run at the same time, and single object is null for both case,
		//There might have multiple singleObject created.
		//Look at the DatabaseSynchronized
		if(singleObject==null) {
			singleObject=new Database(n);
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
