package Facade;

public class TestClass {

	/**A print designer is preparing a printer class. To print, you have to run through a mess of functions like prepareTocala,callPrint....
	 * But actually what we need is "print" method, and done.
	 * 
	 * Facade design makes OOP interface easier to use.  <Difficult interface - Facade - Simple interface>
	 * 
	 * TODO: Principle of Least Knowledge or Law of Demeter: Always go for the loosest coupling you can
	 * 	>Each unit should have only limited knowledge about other units: only units "closely" related to the current unit.
		>Each unit should only talk to its friends; don't talk to strangers.
		>Only talk to your immediate friends.
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * This shit bigboss say:Could not be simpler
		 
		DifficultProduct difficultProduct=new DifficultProduct();
		difficultProduct.setFirstNameCharacter('p');
		difficultProduct.setSecondNameCharacter('r');
		difficultProduct.setThirdNameCharacter('i');
		difficultProduct.setFourthNameCharacter('n');
		difficultProduct.setFifthNameCharacter('t');
		difficultProduct.setSixthNameCharacter('e');
		difficultProduct.setSeventhNameCharacter('r');
		System.out.print(difficultProduct.getName());
		*/
		
		/**Here the simpler way with facade */
		SimpleProductFacade simple=new SimpleProductFacade();
		simple.setName("printer");
		System.out.print(simple.getName());
	}

}
