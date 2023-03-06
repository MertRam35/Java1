package day14_String;

public class MethodOfSpring {
    public static void main(String[] args) {

        String str1 = "  batch 25 :                                                         ";
        str1 = str1.trim();
        System.out.println(str1 + "  hi");

        int str = str1.indexOf("h");
        System.out.println(str);
        String stra = "Java is fun, I love learning Java";

        System.out.println(stra.replace("Java", "Pyhton"));
        String email = "johnsmith@yahoo.com";
        System.out.println(email);
        email = email.replace("yahoo", "gmail");
        System.out.println(email);

        String sentence ="Java Java Pyhton Java Phyton";
        String serntence2 = sentence.replace("Java", "").replace("  ", " ").trim();
        System.out.println(sentence);
        System.out.println("sentence2 = "+serntence2);

        String s = "dog dog dog dog";
        s.replace("dog", "");

    }
}
