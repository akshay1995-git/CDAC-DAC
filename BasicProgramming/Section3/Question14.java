import java.util.Scanner;
class Question14{
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Year: ");
int year = sc.nextInt();
if(year % 4 == 0){
System.out.println("This Year is leap Year");

}
else{
	System.out.println("This Year is Not leap Year");
}
}
}
