package day02_HelloWorld;

public class Task5 {

    public static void main(String[] args) {

        int minutes = 3456789;
        int day = 60 * 24;
        int year = minutes/(day * 365);
        int dayFinal= ((minutes-(year*60*24*365))/(day));
        System.out.println(minutes+" minutes is approximately "+year+ " years and "+ dayFinal+" days");

    }

}
/*write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days

 */