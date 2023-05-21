package Quizes;

public class quiz {

    private  String username= "BugBusters";
    private  String password = "WoodenSpooon";

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}
class LogIn{
    public static void main(String[] args) {

        quiz a = new quiz();
        System.out.println(a.getPassword());
    }
}
