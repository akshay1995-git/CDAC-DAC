import java.util.Scanner;
class Question12{
	public static void main(String[] args) {
		int rem,sum=0;
		Scanner s = new Scanner(System.in);
 		 System.out.println("Enter a number :");
 		 int num=s.nextInt();
             
         while(num != 0) {
         rem = num % 10;
         sum = sum + (rem * rem * rem);
         num = num / 10;
      }
      if(sum == num){
               System.out.println("Given number is an armstrong number.");
      }
      else{
         System.out.println("Given number is not an armstrong number.");
      }
 	}
}