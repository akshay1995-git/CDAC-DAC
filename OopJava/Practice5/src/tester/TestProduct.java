package tester;

import static validation.Validation.*;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import com.app.core.Product;

import customeException.ProductValidateException;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Product> map = new HashMap<>();
		try (Scanner sc = new Scanner(System.in)) {
			boolean flag = true;
			while (flag) {
				System.out.println("Choose Options :\n1.Add the Product in Map\n2. Display all Product"
						+ "\n3. Remove Product from Map\n4. Exit ");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter Product ID");
					int title = sc.nextInt();
					
					if (map.containsKey(title)) {
						throw new ProductValidateException("Book ID is already Present...");
					} else {
						System.out.println("Enter a Product name -Expiry Date");
						map.put(title, new Product(title, sc.next(),validateDate(sc.next())));
						
					}
					break;
				case 2:
                  for(Product p: map.values()) {
                	  System.out.println(p);
                  }
					break;
				case 3:
					System.out.println("Enter a id to remove Data...!!!");
					int id=sc.nextInt();
					if(map.containsKey(id)){
						map.remove(id);
						System.out.println("Product Info Removed SuccessFully...!!! ");
					}
					else {
						throw new ProductValidateException("Product key not found");
					}
					break;
				case 4:
					System.out.println("Enter a File Name...!!!");
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(sc.next()));
					out.writeObject(map);
					
					System.out.println("Product Data Stored in File SuccessFully..!!!");
					
					System.out.println("Enter a File name To Deserialze...");
					
					ObjectInputStream oit = new ObjectInputStream(new FileInputStream(sc.next()));
					@SuppressWarnings("unchecked")
					HashMap<Integer,Product> prd=(HashMap<Integer,Product>)oit.readObject();
					System.out.println(prd);
					flag=false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
