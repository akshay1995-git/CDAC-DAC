import java.util.Scanner;
public class Studdata{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Input the Roll Number of the student : ");
int Rollno = sc.nextInt();
System.out.println("Input the Name of the Student: ");
String Name = sc.next();
System.out.println("Enter a Phy,Chem and computer application Marks");
int total=0;
int[] marks = new int[3];
for(int i=1;i<=3;i++){
marks[i]=sc.nextInt();
total+=marks[i];
}
double percent=(total/3)*100;
System.out.println("Roll No :"+Rollno);
System.out.println("Name of Student :"+Name);
System.out.println("Marks in Physics :"+marks[1]);
System.out.println("Marks in Chemistry : "+marks[2]);
System.out.println("Marks in Computer Application :"+marks[3]);
System.out.println("Total Marks :"+total);
System.out.println("Percentage :"+percent);
sc.close();
}
}