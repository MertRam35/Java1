package day09_IfStatements;
/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax


 */
public class Salarysor {
    public static void main(String[] args) {
        int a = 80000;
        char married='n';
        boolean Married= married=='Y';
        if (a <= 80000&&!Married) {
            System.out.println(" salary is " + (a - a * 0.2));
        } else if (a > 80000 && a <= 100000&&!Married) {
            System.out.println(" salary is " + (a - a * 0.25));
        } else if (a>100000 && a<=130000) {
            System.out.println(" salary is "+ (a-a*30));}
        else if (a>130000) {
            System.out.println(" salary is "+ (a-a*35));
        }else  if (a <= 80000&& Married) {
            System.out.println(" salar is " + (a - a * 0.15));
        } else if (a > 80000 && a <= 100000&& Married) {
            System.out.println(" salar is " + (a - a * 0.20));
        } else if (a>100000 && a<=130000&&Married) {
            System.out.println(" salar is "+ (a-a*25));}
        else if (a>130000&&Married) {
            System.out.println(" salar is "+ (a-a*30));

    }

    }
}

