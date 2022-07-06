package tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import static customeException.StudentHandlingException.*;
import com.app.core.Student;

import category.Category;
import customeException.StudentHandlingException;



public class TestStudent {

	public static Category convertType(String o) {
		return Category.valueOf(o.toUpperCase());
		
	}
	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			ArrayList<Student> st=new ArrayList<Student>();
			boolean flag=true;
			while(flag) {
				System.out.println("Options\n1. Enter a Student Detail.\n2. Dispaly all Student Detail\n3. Update Student Detail."
						+ "\n4. Cancel the Student Addmission ");
				switch(sc.nextInt()) {
				case 1:
				System.out.println("Enter a detail :id-name-email-phone-course-marks");
				st.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.next(),convertType(sc.next()),sc.nextDouble()));
				System.out.println("Student detail updated Successfully...!!!");
					break;
				case 2:
					for(Student s:st) {
						System.out.println(s);
					}
					
					break;
				case 3:
					System.out.println("Enter a Email to update Marks and Phone Number: ");
				String s1=sc.next();
				//Student s1=new Student(sc.next());
				for(Student s:st) {
					if(s.getEmail().equals(s1)) {
						System.out.println("Enter a new Marks...");
						double newMarks=sc.nextDouble();
						
						s.setMarks(newMarks);
						System.out.println("Enter a new Phone number :");
						String newPh=sc.next();
					
						s.setPhno(newPh);
						System.out.println("Student Marks And Phone Number Updated");
					}
					else {
						throw new StudentHandlingException("Student Email not Found Exception....!!!");
					}
				}
					break;
				case 4:
					System.out.println("Enter a id to remove addmission");
					
					Student s2=new Student(sc.nextInt());
					if(st.contains(s2)) {
						
					st.remove(s2);
					System.out.println("Student removed SuccessFully");
					}
					break;
				}
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
// 101 Akshay akshay@gmail.com 987543 REACT 78.99
//102 Akash akash@gmail.com 882443 SPRING 45.99
//
