package day20_Arrays;

public class tasks {

    public static void main(String[] args) {

        String[] classmates = {"ali", "veli", "ahmet", "mehmet", "hasan", "hüseyin", "Kayra", "nuray", "ramazan", "elif"};

        for (int i = 0; i < classmates.length; i++) {
            //System.out.println(classmates[i]);
            for (int j = classmates[i].length() - 1; j >= 0; j--) {
                System.out.print(classmates[i].charAt(j));

            }
            System.out.println();
        }


    }
}
