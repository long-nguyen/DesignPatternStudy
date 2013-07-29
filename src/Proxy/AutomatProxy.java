package Proxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class AutomatProxy implements Runnable{

	private Thread thread;
	private Socket socket;
	private InputStream in;
	private PrintWriter out;
	private int character;		//message from server would be print one by one character
	
	public AutomatProxy(){
		try{
			socket=new Socket("127.0.0.1",8765);
			System.out.println("Connecting...");
			
			in=socket.getInputStream();
			out=new PrintWriter(socket.getOutputStream(),true);
			
			thread=new Thread(this);
			thread.start();
		}catch(IOException e){
			System.err.println("Server is not running");
			System.err.println("Not connected");
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
		if(socket!=null&&socket.isConnected()){
			System.out.println("Connected!!");
		}
	}
	
	@Override
	public void run() {
		try{
			while ((character=in.read())!=-1) {
				System.out.print((char)character);		//Ép kiểu để hiện kí tự lên, nếu ko thì nó hiện số int
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	
	//This is the function for client code to interact with.
	//Send to server
	
	public void gotApplication()
	{
		out.println("gotApplication");
	}

	public void checkApplication()
	{
		out.println("checkApplication");
	}

	public void rentApartment()
	{
		out.println("rentApartment");
	}
}
