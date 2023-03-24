package day39_Inheritance2.Task;

public class Employee extends Person {
    private double employeeId;
    private String jobTitle;
    private double salary;

    public double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, double employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }
    public void work(){
        System.out.println(getName()+" is working");

    }

    public String toString() {
        return "Employee{" +
                "employeeId=" + getEmployeeId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
