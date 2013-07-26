package Iterator;

import java.util.Iterator;

public class Testclass {

	/**
	 * 
	 * Định nghĩa GoF:Provide a way to access the elements of an aggregate object sequentially
	 * without EXPOSING its underlying representation.
	 * 
	 * Cái này là single responsibility: collection maintains the collection; the iterator provides access to
	 * the elements of the collection
	 * Giải thích: Nghĩa là người dùng ko biết cấu trúc của tập hợp ra sao, nhưng vẫn có cách để loop qua từng phần tử
	 * của cấu trúc đó. Tất nhiên cách loop là do developer viết. Nhưng loop class với group class là tách biệt, do đó
	 * việc thay đổi group class không ảnh hưởng đến ng dùng.
	 * 
	 * Thứ 2, các loop class này có chung 1 interface là iterator, hỗ trợ 3 hàm: HasNext, next, remove. Vậy nên có thể nói
	 * là iterator này dùng được cho mọi tập hợp, bất cứ user nào cũng dùng được iterator mà ko cần biết iterator hay group
	 * được cài đặt như thế nào.
	 * @param args
	 */
	public static void main(String[] args) {
		new Testclass();
	}
	
	public Testclass(){
		//Create test data
		division=new Division("Sales");
		division.add("Victor");
		division.add("Ted");
		division.add("Bob");
		division.add("Carol");
		division.add("Alice");
		//Do test
		Iterator iterator=division.iterator();
		while (iterator.hasNext()) {
			VP vp = (VP) iterator.next();
			vp.print();
		}
	}

	Division division;
}
