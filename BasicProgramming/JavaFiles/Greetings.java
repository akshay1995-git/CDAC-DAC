import java.util.Scanner;
public class Greetings{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.next();
    System.out.println("Welcome to Java World" +name);
}
}