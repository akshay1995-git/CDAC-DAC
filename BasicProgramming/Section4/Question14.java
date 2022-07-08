import java.util.Scanner;
public class Question14{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a term up to fibbonaci number find: ");
int num = sc.nextInt();

 int n1=0,n2=1,n3;  
 
 for(int i=2;i<num;i++){
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}
} 