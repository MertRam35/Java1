package day19Loops;

public class quiz {

    public static void main(String[] args) {

        String str = "klamemkmfflrdadddd";

        for (int j = 0; j < str.length(); j++) {
            String result = "";
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if (ch == each) {
                    count++;

                }
            }
            if (count != 1)             /*   if (result.contains(ch + ""))
                    continue;*/
              continue;
              if ( count ==1){
                  System.out.print(j);
                  break;
              }


                //  result += ch;




        }


    }
}
/*
Tasks:
	1. Write a program that can return the first duplicated character from a string
	2. Write a program that cna return the index number of the first duplicated character from a string
	3. Write a program that can display all the characters that appeared twice in the string.
	4. Write a program that can return the index number of the first unique character.

 */