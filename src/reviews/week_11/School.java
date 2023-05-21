package reviews.week_11;

import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {


        Student student1 = new Student("Ramazan", "MERT", 18);
        Student student2 = new Student("Furkan", "Öztürk", 20);
        Student student3 = new Student("Pazilya", "Juat", 22);
        Student student4 = new Student("Ahmet", "ÇelikT", 25);
        Student student5 = new Student("Adel", "Mohsen", 18);

        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(student1, student2, student3, student4, student5));

        ArrayList<Student> res = getStudentsNameStartWith(students, "A");
        System.out.println(res);

    }

    private static ArrayList<Student> getStudentsNameStartWith(ArrayList<Student> students, String prefix) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            String tempName = student.firstName;
            if (tempName.startsWith(prefix)) {
                result.add(student);
            }
        }
        return result;
    }
}
