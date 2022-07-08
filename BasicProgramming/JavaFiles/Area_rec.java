import java.util.Scanner;
public class Area_rec{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a height: ");
int Height = sc.nextInt();
System.out.println("Enter a width: ");
int Width = sc.nextInt();
int Area= Height*Width;
int perimeter = 2*(Height+Width);
System.out.println("The area and perimeter of rectangle is :"+Area);
}
}
