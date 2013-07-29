package Meditator;

/**
 * Assume that you have a website with four pages, user navigate between those
 * pages: each page should not know about other pages's detail.
 * 
 * Meditator often be used in GUI(especially web). But with Mobile it should
 * not(my idea), because you have to keep page's object residing, so it would
 * not be gabarge collected
 * 
 * @author long-nguyen
 * 
 */
public class TestClass {

	public static void main(String args[]) {
		new TestClass();
	}

	public TestClass() {
		Mediator mediator = new Mediator();
		mediator.getWelcome().go();
	}
}
