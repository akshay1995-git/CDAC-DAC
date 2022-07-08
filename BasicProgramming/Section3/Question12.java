import java.util.Scanner;
class Question12{
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Temprature: ");
int t = sc.nextInt();
if(t<0){
	System.out.println("Freezing Wheather");
}
else if(t>0 && t<10){
	System.out.println("Very Cold Temprature");
}
else if(t>10 && t<20){
 	System.out.println("Cold Temprature");
}
else if(t>20 && t<30){
	System.out.println("Normal Temprature");
}
else{
	System.out.println("Hot Temprature");
}
}
}