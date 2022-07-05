package bubbleSort;

public class BubbleSort {
public int[] bubbuleSort(int []arr){
int temp=0;
	for(int i=0;i<arr.length;i++) {//3
		for(int j=0;j<arr.length;j++) {//3,2,5
			if(arr[i]<arr[j]) {//(3<2)(3<5)
			 temp=arr[i];//3
			arr[i]=arr[j];//5
				arr[j]=temp;//3
			}
		}//5
	}
	return arr;
}
public static void main(String[] args) {
	BubbleSort obj=new BubbleSort();
	int []a= {3,2,5,6,4};
	int b[]=obj.bubbuleSort(a);
	for(int k=0;k<b.length;k++) {
		System.out.println(b[k]);
	}
}
}
