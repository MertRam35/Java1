package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh", citizen = "USA";
        int age = 20;
        boolean isEligible = age >= 21 && citizen == "USA";
        if (isEligible) {
            System.out.println("Eligible");
        }
        if (!isEligible) {
            System.out.println("Not Eligile");
        }


    }
}
