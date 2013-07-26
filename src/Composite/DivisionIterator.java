package Composite;

import java.util.Iterator;

public class DivisionIterator implements Iterator{

	private Corporate[]corporate;
	private int loc=0;
	
	public DivisionIterator(Corporate [] c){
		corporate=c;
	}
	
	@Override
	public boolean hasNext() {
		if(loc<corporate.length&&corporate[loc]!=null) {
			return true;
		}else return false;
	}

	@Override
	public Corporate next() {
		return corporate[loc++];
	}

	@Override
	public void remove() {
	}

}
