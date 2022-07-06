
//package tester;
//import java.util.Arrays;
import java.util.Scanner;



public class TestBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many boxes to make?");
		Box []boxes=new Box[sc.nextInt()];
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims w d h");
			boxes[i]=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		//Display using single for-each loop, box dims n volume
		for(Box b : boxes)//b=boxes[0],b=boxes[1]
		{
			double width=1.0;
			System.out.println("volume "+b.getBoxVolume());
			if(b.getBoxVolume()>100) {
				width=b.getWidth()*2;
				System.out.println("Width : "+width);
			}
			else {
				continue;
			}
		}
		
		sc.close();

	}

}