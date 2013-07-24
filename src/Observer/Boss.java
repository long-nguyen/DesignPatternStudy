package Observer;

/**
 * Boss who  want to keep track of all changes, so should be notified when database change, so it is an observer
 * @author long-nguyen
 *
 */
public class Boss implements IObserver{

	@Override
	public void update(String operation, String record) {
		System.out.println("The Boss has received the operation:"+operation+" performed over "+record);
	}

}
