package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza small = new Pizza('S',2,3);
            Pizza medium = new Pizza('M',3,4);
            Pizza large = new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(small,medium,large));
        }
        System.out.println("Total Number of pizza: "+ pizzas.size());

        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }

        System.out.println(totalPrice);



    }




}
