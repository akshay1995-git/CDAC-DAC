package TestShuffle;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;
//import java.util.Vector;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> vl=Arrays.asList(1,2,3,4,5,6,7);
		Collections.shuffle(vl);
		System.out.println(vl);
		List<Double> dl=Arrays.asList(2.3,3.4,5.6,66.44,54.43);
		Collections.shuffle(dl);
		System.out.println(dl);
		ArrayList<String> st=new ArrayList<>(Arrays.asList("aa","bb","cc","dd","ee","ff"));
		Collections.shuffle(st);
		System.out.println(st);
	}

}
