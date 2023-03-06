package day19Loops;

public class quizTask3 {

    public static void main(String[] args) {

        String str = "kalamemmffrrddddd";
        String result = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (count == 2) {
                //  System.out.print(ch);


                if (result.contains(ch + "")) {
                    continue;
                }
                result += ch;


            }
        }
        System.out.print(result);


    }
}

// 3. Write a program that can display all the characters that appeared twice in the string.