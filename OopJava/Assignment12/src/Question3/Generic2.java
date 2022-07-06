package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Generic2 {
	public static double display(Collection<? extends Number> c) {
		Iterator<? extends Number> itr=c.iterator();
		double sum=0.0;
		while(itr.hasNext()) {
			
		sum+=itr.next().doubleValue();
	
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum: "+display(new HashSet<>(Arrays.asList(1,2,3,4,5,6,7))));
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(2,3,5,6,77,88));
		System.out.println("Sum : "+display(al));
		Vector<Double> vl=new Vector<>(Arrays.asList(2.0,3.9,5.4,6.5,77.55,88.40));
	System.out.println("Sum of Vector List :"+display(vl));
	}

}
