package TemplateMethod;

public class Testclass {

	/**Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
	 * Template method lets subclasses redefine certain steps of an algorithm without changing
	 * the algorithms's structure.
	 * 
	 * Giải thích: Robot A: Bạn có 1 thuật toán gồm nhiều bước A,B,C,D,E:
	 * Muốn tạo Robot B
	 *  Trong đó, có 1 số bước có nhiều tinh chỉnh khác nhau(B,C,D).
	 *  Có 1 số bước luôn giữ nguyên(A,E) 
	 *  --> Cần template. 
	 *  Note:Nếu mỗi khi có thay đổi, toàn bộ các bước đều cần viết lại toàn bộ từ đầu thì ko cần Pattern này.
	 * 
	 * Cái này tương tự như Android, chúng ta viết thêm vào các hàm onCreate, onPause...
	 * @param args
	 */
	public static void main(String[] args) {
		AutomotiveRobo autoRobo=new AutomotiveRobo("autorobo");
		CookieRobo cookieRobo=new CookieRobo("cooker");
		autoRobo.go();
		System.out.println();
		cookieRobo.go();
	}

}
