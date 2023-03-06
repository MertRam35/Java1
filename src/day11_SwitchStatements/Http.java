package day11_SwitchStatements;

public class Http {
    public static void main(String[] args) {

      int statusCode =201;
        String output=(statusCode==200) ?"ok": (statusCode==201)? "created":
                (statusCode==202)? "accepted":"invalid code" ;
        System.out.println("output = " + output);





    }
}
