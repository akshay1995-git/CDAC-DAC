import java.util.Scanner;
public class Question18{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Letter ");
char ch = sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println("The letter is vowel");

}
else{
	System.out.println("The letter is Consonants");
}
}
}