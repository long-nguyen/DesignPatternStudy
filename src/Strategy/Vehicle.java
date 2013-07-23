package Strategy;

/**
 * Actually you have a has-a relationship:
 * the Vehicle has a go function. 
 * and every its children has go function 
 * @author long-nguyen
 *
 */
public  class Vehicle {
	private IGoAlgorithm goAlgorithm;
	public void setGoAlgorithm(IGoAlgorithm go){
		goAlgorithm=go;
	}
	
	public void go(){
		goAlgorithm.go();
	}
}
