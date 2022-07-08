import java.util.Scanner;
class Question4{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
 		 System.out.println("Enetr a number :");
 		 	int num=sc.nextInt();
	int factor=1;
	if(num<=2){
	System.out.println("Factorial is="+num);
	}
	else{
		for(int j=num;j>=1;j--){
			factor*=j;
		}
		System.out.println("Factorial is="+factor);

	}
}
}