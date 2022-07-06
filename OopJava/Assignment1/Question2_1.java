import java.util.Scanner;

public class Question2_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        int teaQty = 0, greenTeaQty = 0, samosaQty = 0, sandwitchQty = 0;

        do {
            System.out.println("****Welcome to Food Mart *********");
            System.out.println("1. Tea (Rs. 10)");
            System.out.println("2. Green Tea (Rs. 15)");
            System.out.println("3. Samosa (Rs. 20)");
            System.out.println("4. Sandwitch (Rs. 50)");
            System.out.println("5. Generate Bill & Exit");
            System.out.println("Enter your choice :");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the quanity:");
                    teaQty = teaQty + scan.nextInt();
                    break;
                case 2:
                    System.out.println("Enter the quanity:");
                    greenTeaQty = greenTeaQty + scan.nextInt();
                    break;
                case 3:
                    System.out.println("Enter the quanity:");
                    samosaQty = samosaQty + scan.nextInt();
                    break;
                case 4:
                    System.out.println("Enter the quanity:");
                    sandwitchQty = sandwitchQty + scan.nextInt();
                    break;
                case 5:
                    double totalBill = teaQty * 10 + greenTeaQty * 15 + samosaQty * 20 + sandwitchQty * 50;
                    System.out.println("Your total bill is " + totalBill);
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        } while (flag);

        scan.close();

    }

}
