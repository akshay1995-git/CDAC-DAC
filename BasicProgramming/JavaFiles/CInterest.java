import java.util.Scanner;
public class CInterest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a sum: ");
int sum = sc.nextInt();
System.out.println("Please enter a Interest: ");
float rate = sc.nextFloat();
System.out.println("Please enter a Time in year: ");
int time = sc.nextInt();
double Amount = sum * (Math.pow((1 + rate/100), (time)));
double Interest=Amount-sum;
System.out.println("Total amount :"+Interest);
}
}