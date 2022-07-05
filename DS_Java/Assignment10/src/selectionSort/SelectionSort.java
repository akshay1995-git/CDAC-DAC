package selectionSort;

public class SelectionSort {
public int[] selection(int[] arr) {
	int temp;
	for(int i=0;i<arr.length;i++) {//3,2,1,4
		int min=i;//0/1
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[min]) {//2<3,1<3
				min=j;//1/2
				//pos=j;
			}
			if(min!=j) {//1!=0,2!=1
			 temp=arr[i];//3,3
			arr[i]=arr[j];//2,1
			arr[j]=temp;//3,3
			//2,3,1,4/1,3,
			}
		}
	}
	return arr;
}
public static void main(String[] args) {
	SelectionSort sort=new SelectionSort();
	int arr[]= {3,2,1,4};
	int[] result=sort.selection(arr);
	for(int i=0;i<result.length;i++) {
		System.out.println(arr[i]);
	}
}
}
