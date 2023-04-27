package reviews.week_06;

public class Tsk1 {

    /*Task 1: Given a sentence which is string find word how many times repeats in it.

    Hint: use substring with for loop

    input:
    *                                String str="Java is java in everywhere is Java";
    *                                String word="Java";
    output:3

     */
    public static void main(String[] args) {

        String sentence = "Java is java in everywhere is Java";
        String word = "Java";
int count =0;
        for (int i = 0; i < sentence.length()-3; i++) {
            String temp = sentence.substring(i,i+word.length());
            if (temp.equalsIgnoreCase(word))
      count++;
        }
        System.out.println(count);


    }
}
