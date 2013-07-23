package Observer;
/**
 * Tạo 1 interface cho object cần theo dõi
 * @author HP Elitebook
 *
 */
public interface ISubject {
	public void registerObserver();
	public void unregisterObserver();
	public void notifyObservers();
}
