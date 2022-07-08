import java.util.Scanner;
public class Question13{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Letter to Find ASCII value: ");
char ch = sc.next().charAt(0);
int ASC = ch;
System.out.println("ASCII value is : "+ASC);
}
}