package Composite;

import java.util.Iterator;


public class Corporation extends Corporate{

	private Corporate[] corporate=new Corporate[100];
	int number=0;
	public Corporation(){
		
	}
	
	public void add(Corporate c)
	{
		corporate[number++]=c;
	}

	public Iterator iterator(){
		return new DivisionIterator(corporate);
	}
	
	public void print(){
		Iterator iterator=iterator();
		while (iterator.hasNext()) {
			Corporate c=(Corporate)iterator.next();
			c.print();
		}
	}
}
