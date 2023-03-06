package day10_Nestedif;

public class TernariesWithNestedİf {
    public static void main(String[] args) {


        double score = 55;
        if (score >= 0 && score <= 100) {
            if (score > 59) {
                System.out.println("CCongrats, you passed");
            } else {
                System.out.println("sorry");
            }
        } else {
            System.out.println("invalid score");
        }
       String data = (score >= 0 && score <= 100)? (score > 59) ? "CCongrats, you passed": "sorry" :"invalid score";
        System.out.println("DATA :" + data);
        System.out.println("-----------------");
        if (score > 59 && score >= 100) {
            System.out.println("CCongrats, you passed");
        } else {
            System.out.println("sorry, failed");


        }


    }
}
