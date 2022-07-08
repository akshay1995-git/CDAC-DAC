class Question10{
	public static void main(String[] args){
		int[] array = {23,14,54,66,12};
		int Min=array[0];
		int Max=array[0];
	  
	  	for(int i=1;i<array.length;i++){
	  		if(array[i]<Min){
	  			Min=array[i];
	  			
	  		}
	  		else{
	  			continue;
	  		}
	  	}
	  	System.out.println("Minimum element from given array="+Min);
	  

		}
}
		