package Singleton;

/**
 * Dont need to use synchronized keyword but still want to make sure only one object created 
 * @author long-nguyen
 *
 */
public class DatabaseThreaded {

	//singleObject is created before any thread can touch it
	private static DatabaseThreaded singleObject=new DatabaseThreaded("hahaha");
	private int record;
	private String name;
	
	//Create a private contructor so there would be no usable "new" keyword
	private DatabaseThreaded(String n){
		name=n;
		record=0;
	}

	public static DatabaseThreaded getInstance(String n){
		return singleObject;
	}
	
	public void editRecord(String op){
		System.out.print("Performing a "+op+" on a record"+record+" in database "+name);
	}

	public String getName() {
		return name;
	}
}
