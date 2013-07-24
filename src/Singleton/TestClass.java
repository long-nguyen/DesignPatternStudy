package Singleton;

public class TestClass {

	/**
	 * Trường hợp xảy ra là có quá nhiều object lớn trong hệ thống, chiếm quá nhiều dung lượng bộ nhớ.
	 * và có thể nhiều object của cùng 1 class(dùng Singleton hoặc FlyWeight)
	 * 
	 * Singleton: Ensure a class only has one instance, and provide a global point of access to it.
	 * vd: Đối tượng database nếu có uqas nhiều object thì xảy ra việc ko đồng bộ dữ liệu
	 * @param args
	 */
	public static void main(String[] args) {
		/** test simple singleton
		Database database;
		database=Database.getInstance("products");
		System.out.println(database.getName());
		database=Database.getInstance("Power");
		System.out.println(database.getName()); //No new object created
		
		*/
		
		/**Test thread  */
		TestThread thr1=new TestThread("product");
		TestThread thr2=new TestThread("power");
		thr1.start();
		thr2.start();
		
		
	}
	

}
