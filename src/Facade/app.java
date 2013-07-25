package Facade;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * java example, using WindowAdapter to work to handle just the window closing event instead of implement
 * the WindowListener interface which requires to implements all other methods.
 */
public class app{

	public static void main (String []args){
		AppFrame a=new AppFrame();
		a.setSize(200,200);
		/**Here what we need to implement if not using Facade
		a.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		*/
		a.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		a.setVisible(true);
	}
	

}

class AppFrame extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		g.drawString("Using a window adapter", 60, 100);
	}
}
