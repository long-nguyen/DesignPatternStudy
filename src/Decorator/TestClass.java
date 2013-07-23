package Decorator;

public class TestClass {
	/**
	 * The ComputerDecorator is a decorator class, it lets the inherited class to modify the description function
	 * Ví dụ như sau: Lớp Computer thực thi hàm description. Tuy nhiên tương lai, khách hàng lúc thì thích thêm cái này
	 * lúc thì thích thêm cái nọ vào hàm description, vậy có thể dùng Strategy.
	 * Tuy nhiên cũng có thể tạo decorator như sau:
	 * @param args
	 */
	public static void main(String[] args) {
		Computer comp=new Computer();
		//Test print
		System.out.println(comp.description());
		//If you wan the computer to have a disk reader
		comp=new Disk(comp);
		//Want to add more disk?
		comp=new Disk(comp);
		comp=new Power(comp);
		comp=new Monitor(comp);
		//Finally print out what you have decorated. You avoided modifying the core Computer class
		System.out.print(comp.description());
	}

}
