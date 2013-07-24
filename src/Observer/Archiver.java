package Observer;

/**
 * Archiver who  response for data backup should be notified when database change, so it is an observer
 * @author long-nguyen
 *
 */
public class Archiver implements IObserver{

	@Override
	public void update(String operation, String record) {
		System.out.println("The archiver has received the operation:"+operation+" performed over "+record);
	}

}
