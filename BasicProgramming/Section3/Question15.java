import java.util.Scanner;
class Question15{
public static void main(String[] args) {
	
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number: ");
int num = sc.nextInt();
if(num%3==0 && num%5==0){
System.out.println("The Number is Divisible by 3 and 5");

}
else{
	System.out.println("The Number is not Divisible by 3 and 5");
}
}
}
