package TestFruit;

import java.util.Scanner;
import Fruit.*;

public class TestFruitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Fruit list count :  ");
		FruitList fruits[] = new FruitList[sc.nextInt()];
		boolean flag = true;
		int counter = 0;
		while (flag) {
			System.out.println(
					"Enter a Fruit no. to add in basket as per choice :\n 1. Apple\n 2. Mango\n 3. Orange \n4. To Check the FruitsList"
							+ "\n5. End Of Fruit List");
			switch (sc.nextInt()) {
			case 1:
				if (counter < fruits.length) {
					fruits[counter++] = new Apple("Apple", "Sweet and Sour in taste");
				} else {
					System.out.println("Bag is Full !! can't add Fruit.......");
				}
				break;
			case 2:
				if (counter < fruits.length) {
					fruits[counter++] = new Mango("Mango", "Sweet  in taste");
				} else {
					System.out.println("Bag is Full !! can't add Fruit.......");
				}
				break;
			case 3:
				if (counter < fruits.length) {
					fruits[counter++] = new Orange("Orange", "Sour in taste");
				} else {
					System.out.println("Bag is Full !! can't add Fruit........");
				}
				break;
			case 4:
				for (FruitList p : fruits) {
					System.out.println(p.getDetail());
				}
				break;
			case 5:

				System.out.println("Have a nice taste....!!!!");
				flag = false;
				break;
			}
		}
		sc.close();
	}

}
