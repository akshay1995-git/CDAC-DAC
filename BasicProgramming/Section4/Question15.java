import java.util.Scanner;
class Question15{
public static void main(String[] args)   
{  
Scanner s = new Scanner(System.in);
 		 System.out.println("Enter a number :");
 		 int num=s.nextInt();
int rev = 0;  
while(num != 0)   
{  
int rem = num % 10;  
rev = rev * 10 + rem;  
num = num/10;  
}  
System.out.println("The reverse of the given number is: " + rev);  
}  
} 