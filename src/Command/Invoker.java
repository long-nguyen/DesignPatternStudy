package Command;

public class Invoker {
	ICommand[] commands=new ICommand[5];
	int pos;
	public Invoker(){
		pos=-1;
	}
	
	public void setCommand(ICommand c){
		if(pos<commands.length-1){
			pos++;
			commands[pos]=c;
		}else{
			for(int i=0;i<commands.length-2;i++){
				commands[i]=commands[i+1];
			}
			commands[pos-1]=c;
		}
	}
	
	public void run(){
		commands[pos].execute();
	}
	
	public void undo(){
		if(pos>=0){
			commands[pos].undo();
		}
		pos--;
	}
}
