package day39_Inheritance2.Task;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, double employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void fixingBugs() {
        System.out.println(getJobTitle()+" "+getName() + " is fixing bugs");
    }

    public void work() {
        System.out.println(getJobTitle()+" "+getName() + " is developing");
    }



}
