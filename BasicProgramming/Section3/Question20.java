import java.util.Scanner;
class Question20{
public static void main(String[] args) {
	

   Scanner sc = new Scanner(System.in);
   int[] array=new int[5];
   
System.out.println("Enter a 5 Numbers: ");
   for(int i=0;i<5;i++){
   
		array[i]=sc.nextInt();
	}
	for(int i=1;i<array.length;i++){
			for(int j=0;j<i;j++){
				int temp;
				if(array[i]>array[j]){
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;

				}
				else if(array[i]<array[j]){
					continue;
				}
				else{
					continue;
				}
			}
	  	
	  

		}
		System.out.println("Minimum element from given array="+array[1]);
}
}
		