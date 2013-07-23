package Observer;

public interface IObserver {
	/**Hành động nào xảy ra, xảy ra trên record nào*/
	public void update(String operation,String record);
}
