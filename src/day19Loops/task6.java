package day19Loops;

import java.util.HashMap;

public class task6 {

    public static void main(String[] args) {

        String input = "examplehow many people string";
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
                System.out.println(charFrequency);
            } else {
                charFrequency.put(c, 1);
            }
        }

        // Find the character with the highest frequency
        char maxChar = ' ';
        int maxCount = 0;
        for (char c : charFrequency.keySet()) {
            if (charFrequency.get(c) > maxCount) {
                maxChar = c;
                maxCount = charFrequency.get(c);
            }
        }

        System.out.println("Character with highest frequency: " + maxChar+"  "+maxCount);

    }
}
