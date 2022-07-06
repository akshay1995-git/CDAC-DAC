package tester;
import static com.app.core.Library.sdf;
import static utils.CollectionUtils.populateData;
import static utils.CollectionUtils.populateHashMap;
import static utils.ValidationUtils.convertCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.app.core.Category;
import com.app.core.Library;

public class Tester {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Library> library = populateHashMap(populateData());
			boolean exit = false;
			while (!exit) {
				System.out.println("Options: 1. Add book 2. Display All books in a library 3. Display all product names of a particular category");
				System.out.println("4. Display sum of all even nos between 1-100 ");
				System.out.println("5. Display sum of product prices of a specific category. 6. Display average  of product prices of a specific category");
				System.out.println("7. Most expensive book in the store. 10. Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // Adding the book
						System.out.println("Enter book details: Title(string),Category(enum),Price ,Publish Date,authorName,quantity");
						System.out.println("Enter book title");
						sc.nextLine();
						String title1 = sc.nextLine();
						Library lib =library.get(title1);
						if(lib==null) {
							//add
							System.out.println(library.put(title1, new Library(title1, convertCategory(sc.next()), sc.nextDouble(), sdf.parse(sc.next()), sc.next(),sc.nextInt())));
						}
						else {
							lib.setQuantity(lib.getQuantity()+1);
						}
						System.out.println("Book added successfully");

						break;
						
						case 2://Display all book details
							for(Library l : library.values())
								System.out.println(l);
							break;
							
						case 3://Display all product names of a particular category , exceeding specific price.
							//I/P category name & price.
							//(stream,filter,forEach)
							System.out.println("Enter particular category of book: ");
							String bookCategory = sc.next().toUpperCase();
							System.out.println("Enter price to filter : ");
							double price = sc.nextDouble();
							ArrayList<Library> list = new ArrayList<>(library.values());
							list.stream().forEach(temp -> {
								if((temp.getCtype()==Category.valueOf(bookCategory))&&(price==temp.getPrice()))
									System.out.println(temp);
							});
							
							break;
							
						case 4:// Display sum of all even nos between 1-100.
							IntStream stream = IntStream.range(1, 100);
							//map/filter-- using lamba
							System.out.println(stream.filter((temp)->temp%2==0).sum());
							
							//using method reference
							break;
							
							
						case 5: //Display sum of product prices of a specific category.-I/P category name-o/p sum.
							System.out.println("Enter category of book : ");
							String category = sc.next().toUpperCase();
							ArrayList<Library> list1 = new ArrayList<>(library.values());
							
							System.out.print("Total price of "+category+ " are: Rs:");
							System.out.println(list1.stream().filter((temp1)-> temp1.getCtype()==(Category.valueOf(category))).mapToDouble((temp1)-> temp1.getPrice()*temp1.getQuantity()).sum());
							break;
							
							
							//---------------------------------------------------DOUBT---------------------------------------------------//
						case 6://Display average  of product prices of a specific category.--I/P category name - > o/p average
							System.out.println("Enter category of book : ");
							String category2 = sc.next().toUpperCase();
							ArrayList<Library> list2 = new ArrayList<>(library.values());
							System.out.print("Average price of "+  category2 +" is : Rs");	
							System.out.println(list2.stream().filter((temp1)-> temp1.getCtype()==(Category.valueOf(category2))).mapToDouble((temp1)-> temp1.getPrice()*temp1.getQuantity()).average());
							break;
							
							
							//DOUBT------------------------------------------------
						case 7://Find name of the product which is most expensive.
							System.out.println("Most expensive book: ");
							ArrayList<Library> list3 = new ArrayList<>(library.values());
							System.out.println(list3.stream().mapToDouble((temp1)-> temp1.getPrice()).max());
							break;
							
						case 10:
							exit = true;
							break;
					}
					
				}
				catch(Exception e ) {
					e.printStackTrace();
					System.out.println("Exception in tester's inner" +e.getMessage());
					sc.nextLine();
				}
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Exception in tester's outer "+e.getMessage());
		}

	}

}

//DAY_14
//1. Create int[] ---> IntStream & display its contents.
//IntStream stream1 = IntStream.of(4,5,6,7,8);
//Display using Java 8 features - lambda
//stream1.forEach(val -> System.out.println(val));

//Display using iterator
//Iterator<Integer> itr = stream.iterator();
//while(itr.hasNext()) {
//	//be - default sequential stream
//	System.out.println(itr.next());
//}

//2. Create AL<Integer> , populate it.
//ArrayList<Integer> list =Arrays.asList(4,5,4,5,6,7,8);
//Stream<Integer> stream2 = list.stream();
//Convert it to seq stream & display elems
//stream2.forEach(temp->System.out.println(temp));
//
//System.out.println();
//Convert it to parallel stream & display elems
//Stream<Integer> stream3 = list.parallelStream();
////stream3.forEach(temp->System.out.println(temp));
//System.out.println();
//stream3.forEach(System.out::println);
//
//System.out.println(stream2);
//3. Create stream of ints between 1-100 & display all even elements.
//(Hint : IntStream methods --range,filter,forEach)
//IntStream stream = IntStream.range(1, 100);
//stream.filter((temp)->temp%2==0).forEach(System.out::println);
//
//List<String> list = Arrays.asList("Ankit","Ram","Mona","Raj","Ramesh");
//list.stream().filter(temp->temp.startsWith("R")).forEach(System.out::println);
//list.stream().filter(temp->temp.equals("Ram")).forEach(System.out::println);



	
			
			
	