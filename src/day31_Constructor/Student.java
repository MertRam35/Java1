package day31_Constructor;

public class Student {


    public String name;
    public int age;
    public char grade;
    public char gender;
    public int id;

    public Student(String name, int age, char grade, char gender, int id) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
        this.id = id;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }




}
