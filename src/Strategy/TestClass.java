package Strategy;

public class TestClass {

	/**Mục đích: khi có quá nhiều lớp con cùng overidde 1 hàm,
	 * việc bảo dưỡng, thay đổi hàm đó là rất khó khăn, nhất là khi muốn thay đổi
	 * ở lớp cha.  
	 * Vậy thì thay vì nhiều lớp con khác nhau, mỗi lớp con lại overidde lại hàm đó,
	 * ta đặt hàm đó riêng ra thành 1 lớp thuật toán.
	 * gọi là Has-a
	 * @param args
	 */
	public static void main(String[] args) {
		/*This is for testing each child with specific go function
		 
		VehicleBoat boat=new VehicleBoat();
		boat.go();
		VehicleCar car=new VehicleCar();
		car.go();
		VehiclePlane plane =new VehiclePlane();
		plane.go();
		*/
		/*
		 * You can apply functions when running application(which could not be done using inheritance)
		 * So, you can see that the boat now can fly and surf
		 */
		VehicleBoat boat2=new VehicleBoat();
		boat2.setGoAlgorithm(new GoAlgorithmFly());
		boat2.go();
		boat2.setGoAlgorithm(new GoAlgorithmSurfing());
		boat2.go();
	}

}
