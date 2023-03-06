package day11_SwitchStatements;

public class GradeSwitch {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println(grade + " : excellent");
              break;
            case 'B':
                System.out.println(grade + " : Great Job");
               // break;
            case 'C':
                System.out.println(grade + " : good");
                break;
            case 'D':
                System.out.println(grade + " : passed");
                break;
            case 'F':
                System.out.println(grade+" : failed");
            default:
                System.out.println(" invalid");
        }


    }
}
