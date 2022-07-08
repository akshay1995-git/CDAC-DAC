import java.util.Scanner;
public class Question6{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a age to cast for vote ");
int age = sc.nextInt();
if(age>=18){
	System.out.println("You are eligible for vote ");
}
else{
	System.out.println("You are not eligible for vote ");
}
}
}