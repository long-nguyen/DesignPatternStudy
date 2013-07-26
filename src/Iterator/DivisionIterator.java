package Iterator;

import java.util.Iterator;

//Because Java already has iterator interface, so we use it
public class DivisionIterator implements Iterator{

	private VP[] VPs;
	private int location=0;
	public DivisionIterator(VP[] v) {
		VPs=v;
	}

	@Override
	public boolean hasNext() {
		if(location<VPs.length&&VPs[location]!=null){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		return VPs[location++];
	}

	@Override
	public void remove() {
		
	}


}
