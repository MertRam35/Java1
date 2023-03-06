package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter radius of circle");
        double circle=scanner.nextDouble();
        scanner.close();
        double pi= 3.14;
        double area=2 * pi* circle * circle;
        System.out.println("area = " + area);
        double perimeter= pi*(circle+circle);
        System.out.println("perimeter = " +(int) perimeter);






    }
}
