import java.util.Scanner;
class Question13{
	public static void main(String[] args) {
	int flag = 0;
		Scanner s = new Scanner(System.in);
 		 System.out.println("Enter a number :");
 		 int num=s.nextInt();
 		 for(int i=2;i<num;i++){
            if(num%i!=0){
            	continue;
            }
            else{
            	flag=1;
            	break;
            }
 		 }
 		 	if(flag==0){
 		 		System.out.println("Given number is a prime number.");
 		 	}
 		 	else{
 		 		System.out.println("Given number is not a prime number.");
 		 	}
 		 
 	}
}