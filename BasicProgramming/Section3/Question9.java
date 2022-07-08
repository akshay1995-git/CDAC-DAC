import java.util.Scanner;
public class Question9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number 1: ");
int num1 = sc.nextInt();
System.out.println("Enter a number 2: ");
int num2 = sc.nextInt();
System.out.println("Enter a number 3: ");
int num3 = sc.nextInt();
if((num1>num2) && (num1>num3)){
	System.out.println("The First  number is greter than Second and Third number ");
}
else if((num2<num1) && (num2>num3)){
	System.out.println("The Second number is greater than First and Third number ");
}
else{
	System.out.println("Third number is greater than First and Second number ");
}
}
}