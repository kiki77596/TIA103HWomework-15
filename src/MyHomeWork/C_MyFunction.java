package MyHomeWork;

import java.util.Vector;

public interface C_MyFunction {
	
	default Vector<Integer> RandNumber(int Min,int Max,int e)
	{
		final int or = Min;
		Min--;
		if(Min<0)
			Min = or;
			
		Vector<Integer> a = new Vector<Integer>();
		for (int i = 0; i <e; i++) {
			a.add((int)(Math.random()* (Max-Min+1))+Min);
		}
		return a;
	}
}
