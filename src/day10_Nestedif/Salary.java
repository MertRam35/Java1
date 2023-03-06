package day10_Nestedif;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Write your Salary");
        int salary = scanner.nextInt();
        System.out.println("Are You Married ? Y for Yes");
        Scanner scanne = new Scanner(System.in);
        String married = scanne.nextLine();
                boolean aa = salary < 80000, b1 = married == "Y";
        double a = salary - salary * 0.2, b = salary - salary * 0.25,
                c = salary - salary * 0.3, d = salary - salary * 0.35;
        if (salary < 80000 && b1) {
            System.out.println("salary is " + (salary - salary * 0.15));
        } else if (salary > 80000 && salary < 100000 && b1) {
            System.out.println("salar is " + (salary - salary * 0.20));
        } else if (salary >= 100000 && salary < 130000&&b1) {
            System.out.println("salary is " + (salary - salary * 0.25));
        } else if (salary >= 130000&&b1) {
            System.out.println("salary is " + (salary - salary * 0.30));
        }else if (salary < 80000&&!b1 ) {
                System.out.println("salary is " + (salary - salary * 0.20));
        } else if (salary > 80000 && salary < 100000) {
            System.out.println("salary is " + (salary - salary * 0.25));
        } else if (salary >= 100000 && salary < 130000) {
            System.out.println("salary is " + (salary - salary * 0.3));
        } else if (salary >= 130000) {
            System.out.println("salary is " + (salary - salary * 0.35));
        }


        /*String married = "Y";
        Scanner scan = new Scanner(System.in);
        String arried = scan.hasNextLine();
        boolean aa = salary < 80000, b1 = married == "Y";
        boolean bb = salary > 80000 && salary < 100000
        if (aa) {
            System.out.println("salary is " + (salary - salary * 0.15));
        } else if (salary > 80000 && salary < 100000) {
            System.out.println("salary is " + (salary - salary * 0.20));
        } else if (salary >= 100000 && salary < 130000) {
            System.out.println("salary is " + (salary - salary * 0.25));
        } else if (salary >= 130000) {
            System.out.println("salary is " + (salary - salary * 0.30));*/

        }

    }




