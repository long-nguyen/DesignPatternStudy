package Observer;

public class TestClass {

	/**Đây là 1 mẫu y hệt như broadcast receiver của Android.
	 * Tức là có nhiều observer sẽ đăng kí với đối tượng cần quan sát.
	 * Khi đối tượng đó thay đổi, tất cả observer sẽ nhận dc thay đổi đó.
	 * 
	 * Meaning: Loose coupling beats a monolith:
	 * LooseCoupling means notification, not hard coding(means one class with many linking between object)
	 * Objects are maximumly encapsulated.
	 * 
	 * Java cũng có Observer và Observable, tuy nhiên giá phải trả là Observable lại là 1 class chứ ko phải
	 * interface.
	 * @param args
	 */
	public static void main(String[] args) {
		Database databas=new Database();
		Archiver arc=new Archiver();
		Client cli=new Client();
		Boss boss=new Boss();
		
		databas.registerObserver(arc);
		databas.registerObserver(cli);
		databas.registerObserver(boss);
		
		databas.editRecord("delete", "record 1");
	}

}
