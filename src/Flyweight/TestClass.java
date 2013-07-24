package Flyweight;
/**
 * Mẫu hạng ruồi
 * Vấn đề với Singleton là ko thể Subclass, và lại dùng biến static.
 * Dùng flyweight để tạo ra ít đối tượng hơn, chỉ hoạt động khi cần, ở những context nhất định
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
