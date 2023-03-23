package day39_Inheritance2.Task;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, double employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    public void createTicket(){
        System.out.println(name+" is creating ticket");
    }
    public void work(){
        System.out.println(name+" is testing");
    }


    public String toString() {
        return "Tester{" +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
