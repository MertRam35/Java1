package day02_HelloWorld;

public class Task4 {

    public static void main(String[] args) {

        double fahrenheit = 252;

        double celsius ;


        celsius = (5*(fahrenheit-32))/9;
        System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+" in Celsius");
    }
}
/*- Write a Java program to convert temperature from Fahrenheit to Celsius degree
        - Input a degree in Fahrenheit: 212

                            Formula :         C = (5(F-32))/9

        - Expected Output:
                            212.0 degree Fahrenheit is equal to 100.0 in Celsius

 */