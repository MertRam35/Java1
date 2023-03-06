package day14_String;

public class StringMethodClass3 {
    public static void main(String[] args) {

        String str = "   a  ";

        System.out.println(str.isBlank());
        System.out.println("str.isEmpty() = " + str.trim().isEmpty());
        System.out.println("---------------------------------");

        String s1 = "Yes";
        String s2 = "coMPANY";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        if (s1.equalsIgnoreCase("yes")) {
            System.out.println("congratulations");
        }
        System.out.println("--------------------------------");

        String sentence = "my favorite programming language is JAVA";

Boolean ccc = sentence.toLowerCase().contains("java");


        System.out.println(ccc);



    }

}
