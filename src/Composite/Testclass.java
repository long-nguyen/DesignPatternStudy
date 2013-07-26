package Composite;

public class Testclass {

	/**
	 * Ứng dụng cho cấu trúc cây,　phải lặp qua toàn bộ cây công ty, ứng với mỗi nốt của công ty lại lặp hết toàn bộ nốt đó sử dụng iterator.
	 */
	public static void main(String[] args) {
		new Testclass();
	}

	public Testclass(){
		corporation =new Corporation();
		Division saleD=new Division("sales");
		saleD.add(new VP("Steve", "sales"));
		saleD.add(new VP("Bob", "sales"));
		corporation.add(saleD);
		Division rd=new Division("R&D");
		rd.add(new VP("Ron","R&D"));
		rd.add(new VP("Bilicua","R&D"));
		Division western=new Division("Western R&D");
		western.add(new VP("Hoop","Western R&D"));
		western.add(new VP("Bippo","Western R&D"));
		rd.add(western);
		corporation.add(rd);
		corporation.add(new VP("Kim","Director"));
		corporation.print();
	}
	Corporation corporation;
	
}
