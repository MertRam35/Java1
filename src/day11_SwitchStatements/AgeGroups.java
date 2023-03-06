package day11_SwitchStatements;

public class AgeGroups {
    public static void main(String[] args) {


        int age = 56;
        String groups;
        if (age > 0 && age < 150) {
            if (age < 21) {
                groups = "Teenager";
            } else if (age >= 21 && age < 55) {
                groups = "Adult";
            } else {
                groups = "Senior";
            }

        } else {
            groups = "İnvalid age";
        }

        System.out.println(age + " is " + groups);
    }
}
