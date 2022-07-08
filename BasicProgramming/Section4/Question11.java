import java.util.Scanner;
class Question11{
	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
 		 System.out.println("Enter a number :");
 		 int num=s.nextInt();
 		 for(int i=1;i<num;i++){
 		 	if(num%i==0){
 		 		sum+=i;
 		 	}
 		 }
 		 if(sum==num){
 		 	System.out.println("The given number is perfect number");
 		 }
 		 else{
 		 	System.out.println("The given number is not perfect number");
 		 }
	}
}