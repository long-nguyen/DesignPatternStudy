package Strategy;

public class VehicleCar extends Vehicle{

	public VehicleCar(){
		setGoAlgorithm(new GoAlgorithmRun());
	}
}
