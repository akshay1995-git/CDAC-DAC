import java.util.Scanner;
class Question18{
public static void main(String[] args)   
   {  
	int length=0;
         Scanner s = new Scanner(System.in);
 		 System.out.println("Enter a String :");
 		 String str=s.nextLine();
 		 for(int i=1;i<=str.length();i++){
 		 	length++;
 		 }
 		 System.out.println("Length of String is : "+length);
 	}
}