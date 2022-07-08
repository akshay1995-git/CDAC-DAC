import java.util.Scanner;
class Question2{
public static void main(String[] args) {
			
			int total=0;
 		Scanner s = new Scanner(System.in);
 		 System.out.println("Enetr a 10 number :");
      for(int i=1;i<=10;i++){
      	int num=s.nextInt();
      	total+=num;
      } 
      System.out.println("Total :"+total);
      int avg=total/10;
       System.out.println("Average :"+avg);
 	}	
}