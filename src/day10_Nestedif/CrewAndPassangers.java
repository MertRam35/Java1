package day10_Nestedif;

public class CrewAndPassangers {
    public static void main(String[] args) {
        int total=70;
        int crew = 0;
        int passengers=0;
        if ((total == 50) || (total == 75) || (total == 100)) {
            if (total == 50) {
                crew = 20;
                passengers = 30;
            } else if (total == 75) {
                crew = 25;
                passengers = 50;
            } else {
                crew=30;
                passengers = 70;
            }

            System.out.println("total is "+ total+ " = "+crew+" crew and "+passengers+ " passengers");
        } else
        {
            System.out.println("imvalid Number");

    }


}}

