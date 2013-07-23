package Strategy;

public class VehiclePlane extends Vehicle{

	public VehiclePlane(){
		setGoAlgorithm(new GoAlgorithmFly());
	}
}
