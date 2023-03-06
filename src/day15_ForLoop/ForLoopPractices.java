package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        for (int i = 100; i >= 50; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("--------------");
        for (int i = 1; i < 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("-----------------------------");

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }


    }
    }

