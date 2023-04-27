package day42_ExceptionsContinue;

public class Workout {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--------------Push up started----------");


        for (int i = 0; i < 30; i++) {
            System.out.print("\rPush up "+(i+1));
            Thread.sleep(1500);
        }


        System.out.println("\n--------------Push up finıshed----------");
    }
}
