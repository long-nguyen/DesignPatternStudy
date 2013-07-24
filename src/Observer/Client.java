package Observer;

/**
 * Client who  change database should be notified when database change, so it is an observer
 * @author long-nguyen
 *
 */
public class Client implements IObserver{

	@Override
	public void update(String operation, String record) {
		System.out.println("The Client has received the operation:"+operation+" performed over "+record);
	}

}
