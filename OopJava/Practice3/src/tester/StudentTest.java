package tester;

import java.util.HashSet;
import java.util.Scanner;

import static validation.Validation.validateDate;

import java.io.*;
import com.app.core.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> set = new HashSet<>();
		System.out.println("Enter a file name  to save data...");
		try (Scanner sc = new Scanner(System.in)) {
			
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(sc.next()));
		System.out.println("Enter a Data in Student :name-id-age-Regdate");
         set.add(new Student(sc.next(),sc.nextInt(), validateDate(sc.next())));
         oos.writeObject(set);
	
		System.out.println("Enter a file name to fetch data...");
	
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(sc.next()));
			@SuppressWarnings("unchecked")
			HashSet<Student> st=(HashSet<Student>)ois.readObject();
			System.out.println(st);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	

       }
	}
