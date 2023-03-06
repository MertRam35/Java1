package day14_String;

public class mail {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        System.out.println(email.substring(email.indexOf("@")+1, email.lastIndexOf(".")));

        System.out.println("------------");
String s1 = "Java is fun, Java is cool";


        System.out.println("compact.salça".substring("compaaaact.s".lastIndexOf(".")+1));
    }
}
