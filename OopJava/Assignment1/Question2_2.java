import java.util.Scanner;
class Question2_2{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number: ");
		long num1=sc.nextInt();
		System.out.println("Enter a Second number: ");
        long num2=sc.nextInt();
		long sum = num1+num2;
		System.out.println("Sum : "+sum);
		long sub = num1-num2;
		System.out.println("Sub : "+sub);
		long mul = num1*num2;
		System.out.println("Multiply : "+mul);
		double div = num1/num2;
		System.out.println("Div : "+div);
        sc.close();
	}
}