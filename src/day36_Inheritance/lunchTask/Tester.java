package day36_Inheritance.lunchTask;

public class Tester extends Employee {

    public String testerProperties;
    public Tester(String name, char gender, int age, String jobTitle, int id, double salary, String companyName,String testerProperties) {
        super(name, gender, age, jobTitle, id, salary,companyName);
    this.testerProperties = testerProperties;

    }


}
