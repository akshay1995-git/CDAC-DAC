import java.util.Scanner;
class Question1{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a two number");
		if(sc.hasNextDouble()){
            double num1=sc.nextDouble();
            double num2=sc.nextDouble();
            System.out.println("Average of Number is : "+(num1+num2)/2);
        }
        else{
            System.out.println("Enter number is not Double");
        }
        sc.close();

    }
}
