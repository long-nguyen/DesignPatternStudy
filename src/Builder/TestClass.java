package Builder;

public class TestClass {

	/**Mẫu Builder là tiếp tục của mẫu Template. Ở đây, khách hàng muốn nắm quyền kiểm soát các hành động của robot
	 * --> Ở mẫu template, developer quản lý thứ tự các hàm, ở Builder thì tùy ý thêm bớt quản lý các hàm
	 * Cái này tương tự Factory pattern, nhưng Factory thì không cho khách hàng tham gia vào quá sâu,
	 * và cũng chỉ có 1 bước tạo lập mà thôi.
	 *
	 * Cần: Tạo 2 giao diện: 1 thằng Builder và 1 thằng buildable,
	 * thằng Builder này khai báo các phương thức cho phép khách hàng thêm function, sẽ có các thằng Builder cụ thể sau.
	 * Thằng Buildable là kết quả trả về cho khách hàng
	 * @param args
	 */
	public static void main(String[] args) {
		IRobotBuildable myRobot;
		RobotBuilder robotBuilder;
		//Tùy chọn loại builder
		robotBuilder=new CookieRobotBuilder();
		robotBuilder.addStart();
		robotBuilder.addGetParts();
		robotBuilder.addStop();
		myRobot=robotBuilder.getRobot();
		myRobot.go();
		
		robotBuilder=new AutomotiveRobotBuilder();
		robotBuilder.addAssemble();
		robotBuilder.addStart();
		myRobot=robotBuilder.getRobot();
		myRobot.go();
		
	}

}
