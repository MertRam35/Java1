package day20_Arrays;

public class task4 {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            if (scores[i] > 80) {
                grades[i] = 'A';
            } else if (scores[i] > 70) {
                grades[i] = 'B';

            }
            System.out.println(names[i] + "'s score is " + scores[i] + " and grade is "+grades[i]);
        }
    }
}
