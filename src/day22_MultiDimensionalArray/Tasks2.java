package day22_MultiDimensionalArray;

public class Tasks2 {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (int i = items.length - 1; i >= 0; i--) {
            for (String s : items[i]) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }

    }
}
