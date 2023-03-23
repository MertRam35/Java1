package day39_Inheritance2.Task;

public class Student extends Person {
    public double StudentId;
    public String fieldOfStudy;

    public double getStudentId() {
        return StudentId;
    }

    public void setStudentId(double studentId) {
        setStudentId(studentId);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        setFieldOfStudy(fieldOfStudy);
    }

    public Student(String name, int age, char gender, double studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
