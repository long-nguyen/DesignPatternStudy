package ChainOfResponsibility;

/**
 * Đối với Observer patterns thì mọi observer đều nhận 1 lượng thông tin như nhau, và công bằng.
 * Tuy nhiên ko phải observer nào cũng giống nhau.
 * Đây là mẫu sử dụng chuỗi các notification, Subject->ObA-->ObB-->obC... 
 * 
 * Ví dụ: Khi user click lên UI để yêu cầu 1 help request. Nếu front-end object có thể handle UI click này thì nó handle
 * ko thì nó forward cho tầng thấp hơn để handle...
 * Cái này tương tự như hàm onTouch của Android, nếu hàm return true thì tức là UI tầng trên đã handle được, false thì thằng UI tầng dưới sẽ handle tiếp
 * 
 *  
 * ở đây dùng 3 layers: Front End-->Intermediate Layer ->Application
 *  
 * @author long-nguyen
 *
 */
public class TestClass {
	//Depends on this to make sure who owns the responsibility of help
	public static final int FRONT_END_HELP=1; 		
	public static final int INTERMEDIATE_LAYER_HELP=2; 		
	public static final int APPLICATION_HELP=3;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Application app=new Application();
		IntermediateLayer il=new IntermediateLayer(app);
		FrontEnd fe=new FrontEnd(il);
		fe.getHelp(APPLICATION_HELP);
	}

}
