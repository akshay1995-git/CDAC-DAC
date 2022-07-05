package binarySearch;

public class BinarySearch {
	int binarySearch(int array[],int item)  
	{  
		int left=0;
		int right=array.length-1;
	    int mid;  
	    while(right >= left)   
	    {     
	        mid = (left + right)/2;  
	        if(array[mid] == item)  
	        {  
	            return mid+1;  
	        }  
	        else if(array[mid] < item)   
	        {  
	            left = mid + 1;  
	        }  
	        else   
	        {  
	            right = mid - 1;   
	        }  
	      
	    }  
	    return -1;   
	}   

}
