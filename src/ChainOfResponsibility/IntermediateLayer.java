package ChainOfResponsibility;

public class IntermediateLayer implements IHelp{

	IHelp successor;
	
	public IntermediateLayer(IHelp s){
		successor=s;
	}
	
	@Override
	public void getHelp(int helpConstant) {
		if(helpConstant!=TestClass.INTERMEDIATE_LAYER_HELP){
			//Nếu ko phải lượt của front end thì trả cho đối tượng tiếp theo
			successor.getHelp(helpConstant);
		}else{
			System.out.print("I am intermediate layer , I will help");
		}
	}

}
