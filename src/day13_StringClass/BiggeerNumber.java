package day13_StringClass;

public class BiggeerNumber {
    public static void main(String[] args) {

        int n1 = 25;
        int n2 = 10;
        int n3 = 68;
        int n4 = 0;

        int n5 = 26;
        int n8 = (n1 > n2 && n1 > n3) ? n4 = n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
        System.out.println((n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3); //Neden çalışmıyor bu satır

        //String summa = (n1 > n2 && n1 > n3) ? n1 + " is bigger" : (n2 > n1 && n2 > n3) ? n2 + " is bigger" : n3 + " is bigger";
       // System.out.println(sum + " : " + summa);// String summa da çalışıyor*/

        /*int n1 = 1;// bu örnek çalışıyor
        int n2 = 4;
        int n3 = 7;
        int n4 = 0;

        if (n1 > n2 && n1 > n3) {
            n4 = n1;
        } else if (n2 > n1 && n2 > n3) {
            n4 = n2;
        } else {
            n4 = n3;
        }
        System.out.println(n4+ " is bigger");*/
    }
}




