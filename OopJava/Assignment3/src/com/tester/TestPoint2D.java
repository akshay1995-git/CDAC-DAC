package com.tester;
import java.util.Scanner;

import com.geometry.Point2D;
//import com.geometry.Point2D;
public class TestPoint2D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a First X and Y Coordinates");
        Point2D o1=new Point2D(sc.nextInt(),sc.nextInt());
        System.out.println("Co-ordinates are : "+o1.getDetail());
        System.out.println("Enter a Second X and Y Coordinates");
        Point2D o2=new Point2D(sc.nextInt(),sc.nextInt());
        System.out.println(o1.isEqual(o2)?"Same":"Different");
        Point2D obj=o1.newMethod(o2);
        System.out.println(obj.getDetail());
        System.out.println(o1.calculateDist(o2));

        sc.close();
    }
}
