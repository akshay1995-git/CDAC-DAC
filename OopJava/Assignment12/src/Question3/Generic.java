package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Generic {
public static void display(Collection<?> c) {
	Iterator<?> itr=c.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a[] = new String[]{"abc","klm","xyz","pqr"};
		
		display(new ArrayList<>(Arrays.asList(a)));
		System.out.println();
		display(new HashSet<>(Arrays.asList(1,2,3,4,5,6,7)));
		System.out.println();
		display(new LinkedList<>(Arrays.asList(1.0,2.4,3.99,4.9,5.80)));
		System.out.println();
		display(new LinkedHashSet<>(Arrays.asList("Akshay","Akash","Parth")));
		System.out.println();
		}

}
