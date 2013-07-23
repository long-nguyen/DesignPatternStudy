package Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public abstract class Factory {

	private static HashMap<String,Class<?>> mRegisteredConnection=new HashMap<String,Class<?>>();
	
	public static void registerConnection(String connectionType, Class<?> con){
		mRegisteredConnection.put(connectionType, con);
	}
	
	//Use reflection which would reduce 10% of speed
	public static Connection createConnection(String type){
		Class<?> cClass = (Class<?>)mRegisteredConnection.get(type);
		try {
			Constructor<?> productConstructor = cClass.getDeclaredConstructor(new Class[] { String.class });
			return (Connection)productConstructor.newInstance(new Object[] { });
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
