package tester;

import static java.time.LocalDate.parse;
import static utils.IOUtils.storeData;
import static utils.ValidationUtils.validateDate;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import com.app.core.Hobbies;
import static utils.ValidationUtils.validateInfo;
import com.app.core.Volunteer;

import custom_exception.VolunteerHandlingException;

public class Tester {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			ArrayList<Volunteer> list = new ArrayList<>();			
			boolean flag = false;
			while(!flag) {
				try {
					System.out.println("Options: 1. Add Volunteer 2. Display Vounteers (by hobbies) 3. Store info and Exit");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter volunteer details: name ,date-of-birth");
						String vname= sc.next();
						String dob = sc.next();
						ArrayList<Hobbies> hobby = new ArrayList<Hobbies>();
						boolean add = false;
						while(!add) {
							System.out.println("1. Add Hobbies 2. Proceed to another..!!");
							switch (sc.nextInt()) {
							case 1: //Add Hobbies
							System.out.println("Enter Hobbies");
								String hobbit = sc.next();
								for(Hobbies v : hobby) {
									if(v.equals(Hobbies.valueOf(hobbit.toUpperCase())))
										throw new VolunteerHandlingException("One selected hobby cannot be added again..!!");	
								}
								hobby.add(Hobbies.valueOf(hobbit.toUpperCase()));
								System.out.println("Hobby Added");
								break;
							case 2:
								add= true;
								break;
							default:
								System.out.println("Invalid choice...!!!");
								break;
							}
							
						}
						// String vNAme, boolean isAvailable, LocalDate date, ArrayList<Hobbies> hobbie
						list.add(new Volunteer(validateInfo(list,vname,parse(dob)), validateDate(list,parse(dob)), hobby));
						 System.out.println("Volunteer added to list");
					
						break;
						
					case 2: // Show volunteers Who have Same Hobbies.
							System.out.println("Enter volunteer's Hobbies: ");
						String hobbies = sc.next().toUpperCase();
						ArrayList<Volunteer> volun = new ArrayList<>();
						for(Volunteer v : list)
							if(v.getHobbies().stream().filter(ele->ele.equals(Hobbies.valueOf(hobbies))).collect(Collectors.toList()).size() !=0)
								volun.add(v);	
						System.out.println("Volunteers belonging to hobby "+hobbies+" are : ");
						
						for(Volunteer v1 : volun)
							System.out.println(v1);
						break;
						
					case 3:// Store Updated volunteer info in File
						storeData("volunteerinfo.txt",list);
						flag= true;
						break;
						
					default:
						System.out.println("Invalid Choice....!!!");
						break;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
					e.getMessage();
				}
				
				}
			}
		
		catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("In tester's outer catch block...!!");
		}

	}

}
