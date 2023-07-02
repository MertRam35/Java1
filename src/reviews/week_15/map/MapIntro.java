package reviews.week_15.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntro {

    public static void main(String[] args) {


        Map<Integer,String> employeeWithNum =  new HashMap<>();
employeeWithNum.put(1,"Ramazan");
employeeWithNum.put(2,"Ramazan");
employeeWithNum.put(3,"Eyup");
employeeWithNum.put(4,"Ali");
employeeWithNum.put(5,"Veli");
        System.out.println(employeeWithNum);
        System.out.println(employeeWithNum.replace(2, "Ali"));

        System.out.println(employeeWithNum.containsKey(5));

        employeeWithNum.remove(5);
        System.out.println(employeeWithNum);
        employeeWithNum.get(5);
// Set<Map.Entry<Integer, String>> entries = employeeWithNum.entrySet(2, "Ramazan", 3, "ahmet", 1,"veli");



    }
}
