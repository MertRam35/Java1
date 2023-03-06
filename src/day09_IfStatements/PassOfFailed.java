package day09_IfStatements;

public class PassOfFailed {
    public static void main(String[] args) {

        double score = 59.1;
        boolean passed = score > 59 && score>=100;
        if (passed) {
            System.out.println("CCongrats, you passed");
        } else {
            System.out.println("sorry, failed");
        }
        System.out.println("-----------------");
        if (score > 59) {
            System.out.println("CCongrats, you passed");
        } else {
            System.out.println("sorry, failed");


        }
    }}
