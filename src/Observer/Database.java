package Observer;

import java.util.Vector;
/**
 * Note: The observers is holding the references of observers, not the real one. So, with java,
 * we dont need to worry about running out of memory 
 * @author long-nguyen
 *
 */
public class Database implements IObservable{

	//Using Vector is thread-safe because all is synchronized methods(ArrayList is not)
	private Vector<IObserver> observers;
	private String operation;
	private String record;
	
	public Database(){
		observers=new Vector<IObserver>();
	}
	
	public void editRecord(String operation,String record){
		this.operation=operation;
		this.record=record;
		notifyObservers();
	}
	
	@Override
	public void registerObserver(IObserver ob) {
		observers.add(ob);
	}

	@Override
	public void unregisterObserver(IObserver ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++){
			IObserver observer=(IObserver)observers.get(i);
			observer.update(operation, record);
		}
	}


}
