package day17_while_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
// daha kısa bir yöntem ?
        String word = "java Java Javajavjava";
        String repeat = "java";
        int a = 0;



        while (word.contains(repeat)){
         word = word.toLowerCase().replaceFirst(repeat, ""); a++;
            System.out.println(word);
        }
        System.out.println("count is "+a);
        word ="java Java Javajavjava";
        a = 0;
        for (int i = 0; i < word.length() - 3; i++) {
           // if (word.toLowerCase().charAt(i) == 'j' && word.toLowerCase().charAt(i + 1) == 'a' && word.toLowerCase().charAt(i + 2) == 'v' && word.toLowerCase().charAt(i + 3) == 'a')
                if (word.toLowerCase().substring(i, i + 4).equalsIgnoreCase(repeat))// enterasan bir hata equals yerine == olunca hata veriyor
                //
                {
                    word = word.toLowerCase().replaceFirst(repeat, "");   a++;
                }


        }
        System.out.println(a);
        System.out.println(word);


    }
}
