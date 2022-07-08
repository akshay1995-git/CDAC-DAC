import java.util.Scanner;
public class Question17{

   public static int fact(int x){
   	int factorial=1;
   	if(x<=2){
	 factorial=x;
	}
	else{
	 int j=x;
	 while(j>=1){
	  factorial*=j;
	  j--;
	  }
	 	    
	}
	return factorial;
	
   }

public static void main(String args[])
{
	int x,factorial=1,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check whether it is strong or not : ");
int n = sc.nextInt();
   	int i=n;
   	while(i!=0){
       x=i%10;
       sum=sum+fact(x);
       i=i/10;

   	}
   	if(sum==n){
   		System.out.println("The given number is strong");
   	}
   	else{
   		System.out.println("The given number is not strong");
   	}


}
}