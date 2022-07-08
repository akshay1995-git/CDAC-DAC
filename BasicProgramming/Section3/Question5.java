import java.util.Scanner;
public class Question5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check whether odd of even: ");
int num = sc.nextInt();
if(num%2==0){
	System.out.println("The given number is Even ");
}
else{
	System.out.println("The given number is Odd ");
}
}
}