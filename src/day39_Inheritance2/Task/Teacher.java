package day39_Inheritance2.Task;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, double employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void work(){
        System.out.println(name+" is teaching");
    }

    public String toString() {
        return "Teacher{" +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
