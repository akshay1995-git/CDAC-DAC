package testEmploy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
//import static com.app.core.sdf;
import static com.app.core.Employ.sdf;
import com.app.core.Employ;

import customeException.EmployHandlingException;

public class TestEmploy {
	public static Date convertDate(String date) throws ParseException {
		return sdf.parse(date);

	}

	public static void main(String[] args) {
		ArrayList<Employ> list = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			boolean flag=true;
			while(flag) {
				System.out.println("Choose the Option :-\n1. Add Employ in List\n2. Display the List of Employ"
						+ "\n3. Display the Perticular Employ Detail.\n4. Delete the Employ from List."
						+ "\n5. Ascending Sort according to HireDate.\n6. Sort According Name and DOB.");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter a Detail : id-name-dob-Hiredate-Salary-Dept");
					list.add(new Employ(sc.next(),sc.next(),convertDate(sc.next()),convertDate(sc.next()),sc.nextDouble(),sc.next()));
					System.out.println("Employ Detail successFully Added...");
					break;
				case 2:
				/*	for(Employ e:list) {
						System.out.println(e);
					}*/
					list.forEach(l -> System.out.println(l));//Lambda ExPression
					
				//	list.forEach(System.out::println);//Method Reference
					break;
				case 3:
					System.out.println("Enter a id of Employ :");
					Employ e1=new Employ(sc.next());
					try{
					if(list.contains(e1)) {
						
						int index = list.indexOf(e1);
						System.out.println(list.get(index));
					}
					}
					catch(Exception e) {
					/*else {
						throw new EmployHandlingException("Employ  Detail is not Found...!!!");
					}*/
						System.out.println("Employ id not matches ");
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.println("Enter a Employ Id to Delete From List...");
					Employ e2=new Employ(sc.next());
					if(list.contains(e2)) {
						list.remove(e2);
						System.out.println("Employ Detail Removed SuccessFully From List");
					}
					else {
						throw new EmployHandlingException("Employ  Detail is not Found,Unable to Delete!!!");
					}
					break;
				case 5:
					Collections.sort(list);
					System.out.println("Employ Data Sorted SuccessFully...!!!");
					break;
				case 6:
					//Ascending Sort Name and Date Of Birth
					Collections.sort(list, new Comparator<Employ>(){

						@Override
						public int compare(Employ o1, Employ o2) {
							if(o1.getName().equals(o2.getName())) {
								if(o1.getDob().before(o2.getDob())) {
									return -1;
								}
								else if (o1.getDob().after(o2.getDob())) {
									return 1;
								}
								
							}
							return 0;
						}
						
						
					});
					break;
				}
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
// 103 Parth 28-5-1995 23-5-2019 44560.56 Sales
//102 Akash 28-5-1993 24-6-2010 32560.56 Marketting
//101 Akshay 28-5-1995 23-5-2020 34560.56 HR
