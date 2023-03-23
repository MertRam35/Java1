package reviews.week_05;

import java.util.Scanner;

public class SwitchExample {
    /*Use a `loop` to print each vowel( a, e, i, o, u) from the given `word`*/

    public static void main(String[] args) {
        String result = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the guest's name:");
        String word = input.nextLine();
        result += ", " + word;
        System.out.println("Do you want to enter another guest's name?");
        String answer = input.nextLine();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the guest's name:");
            String guest = input.nextLine();
            System.out.println("Do you want to enter another guest's name?");
            answer = input.nextLine();

            word += ", " + guest;
        }
        System.out.println("Guests' list: " + word);


    }
}

/*Use a `loop` to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years, and then afterwards it grows by 2 cm every year. Show the growth of the tree each year up to year 10. See the example flow below.

```
Use the format:
year x - growth x cm
tree size: x cm
year 1 - growth 1 cm
tree size: 1 cm

 */





/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     Hint: The string length will be at least 2.

                 input :"Hello" -> "lloHe"
                 input :"java" → "vaja"
                 input :"Hi" → "Hi"

 */
