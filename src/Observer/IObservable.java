package Observer;
/**
 * Tạo 1 interface cho object có thể theo dõi
 * @author HP Elitebook
 *
 */
public interface IObservable {
	public void registerObserver(IObserver ob);
	public void unregisterObserver(IObserver ob);
	public void notifyObservers();
}
