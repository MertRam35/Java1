package replits;

import java.util.Scanner;

public class WaterTax {
    public static double waterTax(double units) {
        //WRITE YOUR CODE BELOW:
        double bill = 0;
        if (units > 150) {
            bill = units * 0.9 + 100;
        } else if (units > 100) {
            bill = units * 0.9 + 50;

        } else if (units > 50) {
            bill = units * 0.9;
        }else bill = units*0.6;

return bill;

    }


//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }


}
