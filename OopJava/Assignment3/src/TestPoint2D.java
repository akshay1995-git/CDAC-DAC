import java.util.Scanner;

public class TestPoint2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a count of Coordinate :");
		Point2D[] arr = new Point2D[sc.nextInt()];
		System.out.println("Length of Array : " + arr.length);
		boolean flag = true;
		while (flag != false) {
			System.out.println(
					" 1.Plot the co-ordinate in array \n 2.Display all ploted co-ordinate \n 3.Test Equality of co-ordinate "
							+ "\n 4.Calculate Distance \n 10.Exit");
			System.out.println("Enter a valid choice : ");
		
				int choice = sc.nextInt();

				switch (choice) {

				case 1:

					System.out.println("Enter a  index ");
					if (sc.hasNextInt()) {
						int index = sc.nextInt();
						System.out.println("Enter a  X and Y Coordinates");
						double x = sc.nextDouble();
						double y = sc.nextDouble();
						if (index < arr.length && index > -1) {
							arr[index] = new Point2D(x, y);
							System.out.println("The new point has been created!");
						} else {
							System.out.println("Index value is not in range of array length!");
						}
					} else {
						System.out.println("No valid value for index");
						System.out.println("Oops..!New Point cant be created");
						sc.nextDouble();
						sc.nextLine();
					}

					break;
				case 2:
					/*
					 * for (int j = 0; j < arr.length; j++) { System.out.println("X : " + arr[j].x +
					 * " & Y : " + arr[j].y);
					 * 
					 * }
					 */
					System.out.println("Created Co-Ordinate are given below...!!!");
					for (Point2D a : arr) {
						if (a != null) {
							System.out.println(a.getDetail());
						}
					}

					break;
				case 3:
					System.out.println("To check Condition of Equality !! Enter 2 index?");
					System.out.println("Enter a first index");
					if (sc.hasNextInt()) {
						//
						int a = sc.nextInt();
						System.out.println("Enter a Second index");
						if (sc.hasNextInt()) {
							//
							int b = sc.nextInt();
							if (a > arr.length - 1 || a < -1 || b > arr.length || b < -1) {
								System.out.println("Index is out of bound ..");
								break;
							}
							if (arr[a] != null && arr[b] != null) {
								System.out.println(arr[a].checkEqual(arr[b]) ? "Co-Ordinates are equal"
										: "Co-Ordinates are not equal");
							} else {
								System.out.println("Array having Null value at given index...");
							}
						} else {
							System.out.println("b index is not integer");
						}
					} else {
						System.out.println("a index is not integer");
					}

					break;
				case 4:
					System.out.println("To find distance between 2 point !! Enter 2 index?");
					System.out.println("Enter a first index");
					if (sc.hasNextInt()) {
						int c = sc.nextInt();
						System.out.println("Enter a second  index");
						if (sc.hasNextInt()) {
							int d = sc.nextInt();
							if (c > arr.length - 1 || c < -1 && d > arr.length || d < -1) {
								System.out.println("Index is out of bound ..");
								break;
							}
							if (arr[c] != null && arr[d] != null) {
								System.out.println("Distance between Co-ordinate : " + arr[c].calculateDist(arr[d]));
							}
						}
					}
					break;
				case 10:

					System.out.println("Choice is out of suggestion......!!!");
					flag = false;
					break;
				}
			
		}
		sc.close();

	}

}
