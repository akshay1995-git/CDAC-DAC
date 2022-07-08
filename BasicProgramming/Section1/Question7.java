import java.util.Scanner;
public class Question7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a sum: ");
int sum = sc.nextInt();
System.out.println("Please enter a Interest: ");
float rate = sc.nextFloat();
System.out.println("Please enter a Time in year: ");
int time = sc.nextInt();
double Interest = (sum*rate*time)/100;
System.out.println("Total amount :"+Interest);
}
}