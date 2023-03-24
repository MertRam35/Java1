package day39_Inheritance2.Task;

public class Cydeo {


    public static void main(String[] args) {
        Tester tester1 = new Tester("ramazan", 37, 'M', 68729, "QA", 15000);
        Developer developer2 = new Developer("mert", 38, 'M', 191986, "Senior", 150000);

        Teacher teacher1 = new Teacher("hkm", 42, 'M', 25648, "İns", 20000);

        Student student1 = new Student("kayra", 10, 'M', 29052013, "Java");


        System.out.println(developer2);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(student1);

        System.out.println("---------------------------");

        developer2.setAge(59);
        System.out.println(developer2);
        System.out.println(developer2.getAge());

        developer2.work();
        tester1.work();
        teacher1.work();
        student1.study();
    }
}
