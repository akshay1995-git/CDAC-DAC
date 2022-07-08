import java.util.Scanner;
public class Question7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number ");
int num = sc.nextInt();
if(num==1){
	System.out.println("The given number is 1 ");
}
else if(num==-1){
	System.out.println("The given number is -1 ");
}
else{
	System.out.println("The given number is neither equal to 1 nor -1 ");
}
}
}