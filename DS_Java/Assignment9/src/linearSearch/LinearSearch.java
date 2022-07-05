package linearSearch;

public class LinearSearch {
	public int searching(int[] array,int value) {
//int []array= {3,5,6,8,2,9,11};
int flag=0;
for(int i=0;i<array.length;i++) {
	if(array[i]==value) {
		flag=i+1;
		//return value;
		break;
		
	}
	else {
		flag=0;
		//return value;
	}
}
if(flag!=0) {
	System.out.println("Value Found in Array...!!");
	return value;
}
else {
	System.out.println("Value Not Found in Array...!!");
	return 0;
}
//return value;

	}
/*public static void main(String[] args) {
	LinearSearch search=new LinearSearch();
	search.searching(5);
}*/
}
