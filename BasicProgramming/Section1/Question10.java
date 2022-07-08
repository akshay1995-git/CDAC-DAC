
class Question10{
	public static void main(String[] args) {
		
	
		System.out.println("Enter a first number: ");
		long num1=Long.parseLong(args[0]);
		System.out.println("Enter a Second number: ");
        long num2=Long.parseLong(args[1]);
		long sum = num1+num2;
		System.out.println("Sum : "+sum);
		long sub = num1-num2;
		System.out.println("Sub : "+sub);
		long mul = num1*num2;
		System.out.println("Multiply : "+mul);
		long div = num1/num2;
		System.out.println("Sum : "+div);
	}
}