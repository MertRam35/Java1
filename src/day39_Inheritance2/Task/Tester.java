package day39_Inheritance2.Task;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, double employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }
    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }


    public String toString() {
        return "Tester{" +
                "employeeId=" + getEmployeeId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
