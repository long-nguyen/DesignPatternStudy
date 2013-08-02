package Flyweight;
/**
 * Mẫu hạng ruồi
 * Vấn đề với Singleton là ko thể Subclass, và lại dùng biến static.
 * Dùng flyweight để tạo ra ít đối tượng hơn, chỉ hoạt động khi cần, ở những context nhất định.
 * 
 * 
 * Ví dụ đơn giản:với 1 trình soạn thảo văn bản, trường hợp mà mỗi kí tự có font, màu, cỡ khác nhau là hoàn toàn có thể xảy ra.
 * Ta ko thể để mỗi 1 kí tự là 1 object được vì số kí tự là rất lớn.
 * Thay vào đó ta có thể đặt một object tên là glyph, chứa màu, font, cỡ, và vị trí của kí tự. Sẽ chỉ có duy nhất 1 glyph object mà thôi
 * @author long-nguyen
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String names[] = {"Ralph", "Alice", "Sam"};
		int ids[] = {1001, 1002, 1003};
		int scores[] = {45, 55, 65};
		double total = 0;
		for (int loopIndex = 0; loopIndex < scores.length; loopIndex++){
			total += scores[loopIndex];
		}
		double averageScore = total / scores.length;
		/**
		 * For managing students, we must have information of all three students.
		 * But instead of creating 3 student object, we use one configurable object,
		 * and change it for suiting situations
		 */
		Student std=new Student(averageScore);
		//Now we use each student as we want
		for (int loopIndex = 0; loopIndex < scores.length; loopIndex++){
			std.setName(names[loopIndex]);
			std.setId(ids[loopIndex]);
			std.setScore(scores[loopIndex]);
			System.out.println("Name: " + std.getName());
			System.out.println("Standing: " +
			Math.round(std.getStanding()));
			System.out.println("");
		}
	}

}
