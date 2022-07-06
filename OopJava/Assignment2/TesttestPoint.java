import java.util.Scanner;
public class TesttestPoint {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a two Parameter");
        //3.6 Accept co ordinates of 2 points from user (Scanner)
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Accept 3rd argument to check Offset");
        double c=sc.nextDouble();
        TestPoint obj=new TestPoint(a,b,c);
        obj.getDetail();
        System.out.println(obj.isEqual()?"Equal":"Not Equal");
        
        System.out.println(obj.offset());
        sc.close();

    }
}
