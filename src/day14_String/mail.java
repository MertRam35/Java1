package day14_String;

public class mail {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        System.out.println(email.substring(email.indexOf("@")+1, email.lastIndexOf(".")));

        System.out.println("------------");
String s1 = "Java is fun, Java is cool";


        System.out.println("compact.salça".substring("compact.s".lastIndexOf(".")+1));
        float a =100.459_524f;
        byte b = (byte) a;
        double c = b;
        System.out.println(c);
    }
}
