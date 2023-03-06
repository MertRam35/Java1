package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int n1=100;
        int n2=102;
        boolean c= n1>n2, d= n1==n2;

        if (c){
            System.out.println(n1+" is maximum number");
        }
        if (d){
            System.out.println("n1 and n2 are equal");
        }
        if (!c&&!d){
            System.out.println(n2+" is maximum number");
        }



    }
}
