package reviews.week_11;

public class Student {

    public String firstName;
    public String LastName;
    public int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
