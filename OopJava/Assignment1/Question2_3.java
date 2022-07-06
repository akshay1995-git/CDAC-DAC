import java.util.Scanner;

class Question2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size : ");
        int size=sc.nextInt();
        double []arr =new double[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextDouble();
        }
        //int num = sc.nextInt();
        for(int j=0;j<arr.length;j++){
        double r1 = arr[j] * 2;
        System.out.println("..........Operation Result on "+j+1+"..........");
        System.out.println("Double of number : " + r1);
        double r2 = arr[j] * arr[j];
        System.out.println("Square of number : " + r2);
        for (int i = 1; i < arr[j]; i++) {
            if (arr[j] == i * i) {
                System.out.println("Square of number :" + i);
            } else {
                continue;
            }
        }
    }
        sc.close();

    }
}