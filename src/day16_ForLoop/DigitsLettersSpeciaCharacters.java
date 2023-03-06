package day16_ForLoop;

public class DigitsLettersSpeciaCharacters {
    public static void main(String[] args) {

        String word = "asdasd,iidşpdASDASDAfgğ8*080976878";


        String digits = "";
        String letters = "";
        String specialChars = "";


        for (int i = 0; i <= word.length() - 1; i++) {
            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;

            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else specialChars += ch;


        }
        System.out.println(digits+" "+ letters+ " "+" "+ specialChars);


    }
}
