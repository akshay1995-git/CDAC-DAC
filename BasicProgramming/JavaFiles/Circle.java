import java.util.Scanner;
public class Circle{
public static void main(String args[])
{
final double PI = 3.14;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a radius: ");
double rad = sc.nextDouble();

double area= PI*rad*rad;
double perimeter = 2*PI*rad;
System.out.println("The area of circle is :"+area);
System.out.println("The Perimeter of circle is :"+perimeter);
}
}
