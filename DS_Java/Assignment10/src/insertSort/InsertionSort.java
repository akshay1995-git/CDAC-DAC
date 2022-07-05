package insertSort;

public class InsertionSort {

	public int[] insertSort(int[] arr) {//3,2,1,4
		//start loop from index 1
		for(int i=1;i<arr.length;i++) {//[1]=2
			//store that index value in temp
			int temp=arr[i];//2
			int j= i-1;  //set another loop behind index
		        while(j>=0 && temp <= arr[j])  //interate loop and check condition (Outer loop ele <its back element)
		        {                          //if(YES) 
		            arr[j+1] = arr[j];  //shift back element to its right 
		            j = j-1; //shift index towards left by -1; 
		        }  
		        arr[j+1] = temp;  
		    
		}
		return arr;//returning sorting array;
		
	}
	public static void main(String[] args) {
		InsertionSort sort=new InsertionSort();
		int arr[]= {3,2,1,4};
		int[] sort1=sort.insertSort(arr);
		for(int i=0;i<sort1.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
