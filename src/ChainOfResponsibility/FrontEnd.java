package ChainOfResponsibility;

public class FrontEnd implements IHelp{

	IHelp successor;
	
	public FrontEnd(IHelp s){
		successor=s;
	}
	
	@Override
	public void getHelp(int helpConstant) {
		if(helpConstant!=TestClass.FRONT_END_HELP){
			//Nếu ko phải lượt của front end thì trả cho đối tượng tiếp theo
			successor.getHelp(helpConstant);
		}else{
			System.out.print("I am front end , I will help");
		}
	}

}
