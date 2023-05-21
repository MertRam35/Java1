package Quizes;



class a {
    public a(){
        System.out.println("a ");
    }
}
class TEST extends a {
    public TEST(){
        System.out.println("B");
    }
    public class B extends TEST{
        public B(){
            System.out.println("C");
        }
    }
    public static void main(String[] args) {


      TEST obj = new TEST();


    }


}
