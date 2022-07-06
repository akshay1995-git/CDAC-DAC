package tester;

import java.io.*;

import java.util.HashSet;
import java.util.Scanner;
import static validation.Validation.*;
import com.app.core.Student;

public class TestStudent {
	public static void main(String[] args) {
		HashSet<Student> list = new HashSet<>();
		HashSet<String> course=new HashSet<>();
		course.add("React");
		course.add("Angular");
		course.add("Java");
		course.add("JavaScript");
		//String[] courseName=course.toArray(new String[course.size()]);
		try (Scanner sc = new Scanner(System.in)) {
			boolean flag = true;
			while (flag) {
				System.out.println("Select Options :\n1. Add Student Detail\n2. Display Student detail\n3. Serialize"
						+ "\n4. Deserialize\n5. Exit");
				
				switch (sc.nextInt()) {
				case 1:
					
					System.out.println("Enter a Detail : name-id-courseList-age-Regdate");
					list.add(new Student(sc.next(),sc.nextInt(), validateDate(sc.next())));
					
					break;
				case 2:
					for (Student s : list) {
						System.out.println(s);
					}
					break;
				case 3:
					System.out.println("Enter a File Name to Serialize :");
					ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(sc.next()));
					oos.writeObject(list);
					oos.flush();
					oos.close();
					break;
				case 4:
					System.out.println("Enter a file to deserialize...");
					ObjectInputStream ois=new ObjectInputStream(new FileInputStream(sc.next()));
					 @SuppressWarnings("unchecked")
					HashSet<Student> st=(HashSet<Student>)ois.readObject();
					System.out.println(st);
					break;
				case 5 :
					System.out.println("Thank you for using Application");
					flag=false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
