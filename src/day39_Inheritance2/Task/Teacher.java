package day39_Inheritance2.Task;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, double employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }


}
