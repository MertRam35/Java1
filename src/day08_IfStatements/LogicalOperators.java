package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 54;
        int number2 = 55;
        String citizen = "USA";
        // Boolean SeLİGİBLE= age>=54 && citizen =="USA";
        age = 54;
        citizen = "USA";
        Boolean İSeLİGİBLE = age >= 54 || citizen == "USAa";
        System.out.println("iSeLİGİBLE = " + İSeLİGİBLE);
        System.out.println("--------------------------------------");
        String name2 = "Jash";
        int creditscore = 720, age2 = 23, income = 4000;
        boolean isEligible2 = creditscore >= 700 && age >= 21 && income >= 6000;
        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("--------------------------");

        String name3 = "Shawy";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'F' || gender == 'M');
        System.out.println(name3 + " is eligible for register : " + isEligible3);
        System.out.println("------------------------");
        String name4 = "james", conutryOfBirth = "UK";
        boolean marriedTUSCitien = false;
        boolean isEligible4 = conutryOfBirth == "UK" || marriedTUSCitien == true;
        System.out.println(name4 + " is eligible for citizen : " + isEligible4);


        System.out.println("-----------------------------");
        String student = "Anna";
        double gpa = 2.5;
        int familyIncome = 100000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(student + " is eligible for scholarship : " + isEligible5);
        System.out.println("-------------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);
        System.out.println("----------------------------");
        int score=85;
        boolean passed= score>=60;
        boolean failed = !passed;
        System.out.println("failed = " + failed);
        System.out.println("pass = " + passed);




    }
}
