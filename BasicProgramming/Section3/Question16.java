import java.util.Scanner;
class Question16{
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
int total=0;
int[] m = new int[3];
for(int i=0;i<3;i++){
System.out.println("Enter a Phy,Chem,Math Marks: ");
 m[i] = sc.nextInt();
total+=m[i];
}
int avg=total/3;
if(avg<30){
	System.out.println("You are Fail");
}
else if(avg>=30 && avg<60){
	System.out.println("Higher Second Class");
}
else if(avg>=60 && avg<80){
 	System.out.println("First Class");
}
else if(avg>=80){
	System.out.println("First Class With Distinction");
}

}
}