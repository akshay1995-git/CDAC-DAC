import java.util.Scanner;
public class Question8{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number 1: ");
int num1 = sc.nextInt();
System.out.println("Enter a number 2: ");
int num2 = sc.nextInt();
if(num1>num2){
	System.out.println("The First  number is greter than Second number ");
}
else if(num1<num2){
	System.out.println("The given Second number is greater than First number ");
}
else{
	System.out.println("Both number are eqaul ");
}
}
}