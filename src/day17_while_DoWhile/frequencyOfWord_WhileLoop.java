package day17_while_DoWhile;

public class frequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = " Java Java Python Python";

        int frequency = 0;


        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);
        String sentence = " cat cat cat cat cat cat cat cat";
        frequency = 0;
        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");

            frequency++;
        }
        System.out.println(frequency);
    }
}
