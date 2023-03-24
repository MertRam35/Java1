package day39_Inheritance2.Task;

public class Student extends Person {
    private double StudentId;
    private String fieldOfStudy;

    public double getStudentId() {
        return StudentId;
    }

    public void setStudentId(double studentId) {
        this.StudentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, double studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public String toString() {
        return "Student{" +
                "StudentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
