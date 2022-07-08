import java.util.Scanner;
public class Question4{
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
int num1 = sc.nextInt();
if(num1>0){
	System.out.println("The given number is Positive ");
}
else{
	System.out.println("The given number is Negative ");
}
}
}