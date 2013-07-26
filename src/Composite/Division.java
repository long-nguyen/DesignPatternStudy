package Composite;

import java.util.Iterator;

public class Division extends Corporate{
	
	private Corporate[] corporate=new Corporate[100];
	private int number=0;
	private String name;
	
	public Division(String n){
		name=n;
	}
	
	public String getName(){
		return name;
	}
	
	public void add(Corporate c){
		corporate[number++]=c;
	}
	
	public void print(){
		Iterator iterator=iterator();
		while (iterator.hasNext()) {
			Corporate corp=(Corporate) iterator.next();
			corp.print();
		}
	}
	
	public Iterator iterator(){
		return new DivisionIterator(corporate);
	}
}
