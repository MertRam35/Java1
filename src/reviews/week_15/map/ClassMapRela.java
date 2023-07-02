package reviews.week_15.map;

import java.util.HashMap;
import java.util.Map;

public class ClassMapRela {


    public static void main(String[] args) {

        Student student = new Student();

        Map<String,String> sTUDENTmap= new HashMap<>();


        sTUDENTmap.put("id","1");
        sTUDENTmap.put("gender","Male");
        System.out.println("sTUDENTmap = " + sTUDENTmap);

        student.setId("1");
        student.setName("Melih");
        student.setGender("Male");
        System.out.println("student = " + student);


    }
}
