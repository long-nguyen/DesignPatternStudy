package Strategy;

public class VehicleBoat extends Vehicle{

	public VehicleBoat(){
		setGoAlgorithm(new GoAlgorithmSurfing());
	}

}
