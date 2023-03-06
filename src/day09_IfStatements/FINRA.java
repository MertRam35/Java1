package day09_IfStatements;

public class FINRA {
    public static void main(String[] args) {
        int number = 15;
        boolean bb = number % 3 == 0, cc = number % 5 == 0, dd = bb && cc;
        if (bb&&!cc) {
            System.out.println("FIN");
        } else if (cc&&!bb) {
            System.out.println("RA");

        }
        if (dd) {
            System.out.println("FINRA");
        } else
            System.out.println(number);
    }

}
