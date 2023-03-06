package day11_SwitchStatements;

public class Grade2 {
    public static void main(String[] args) {
        char grade = 'D';

        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println(grade + " : passed");
                break;
            case 'F':
                System.out.println("Failed");

        }


    }
}
