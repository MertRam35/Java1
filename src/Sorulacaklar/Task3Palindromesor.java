package Sorulacaklar;

public class Task3Palindromesor {

    public static void main(String[] args) {

        String[] str = {"ana", "level", "anak", "kavlak"};
        int count = 0;
        for (String s : str) {

            boolean palindrome = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(s.length() - (i + 1))) {
                    palindrome = true;


                } else {
                    palindrome = false;
                    break;
                }

            }
            if (palindrome) {
                System.out.println(s);
                count++;
            }

        }
        System.out.println(count);


    }
}
