package Proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AutomatServer implements Runnable,IAutomat{

	private IState state;
	private int count;
	private Thread thread;					//Thread for reading data in the background
	private ServerSocket socket;			//Communication
	private Socket communicationSocket;		
	private PrintWriter out;				//For sending result back to proxy
	
	public static void main(String args[])
	{
		new AutomatServer();
	}
	
	public AutomatServer(){
		count=9;
		state=new WaitingState(this);
		try{
			socket=new ServerSocket(8765);
			communicationSocket=socket.accept();
			out=new PrintWriter(communicationSocket.getOutputStream(),true);
			thread=new Thread(this);
			thread.start();
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
	
	@Override
	public void gotApplication() {
		out.println(state.gotApplication());
	}

	@Override
	public void checkApplication() {
		out.println(state.checkAppication());
	}

	@Override
	public void rentApartment() {
		out.println(state.rentApartment());
		out.println(state.dispensekeys());
	}

	@Override
	public void setState(IState s) {
		state=s;
	}

	@Override
	public IState getState() {
		return state;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setCount(int n) {
		count=n;
	}

	@Override
	public void run() {
		String incomingString;
		try{
			BufferedReader reader=new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
			while ((incomingString=reader.readLine())!=null) {
				if(incomingString.equals("checkApplication")){
					checkApplication();
				}else if(incomingString.equals("gotApplication")){
					gotApplication();
				}else if(incomingString.equals("rentApartment")){
					rentApartment();
				}
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}
