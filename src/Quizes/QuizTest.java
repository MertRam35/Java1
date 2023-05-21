package Quizes;

class Test5{
    protected void method(){
        System.out.println("A");
    }
    private void method(int a ){
        System.out.println("b");
    }
}
public class QuizTest extends Test5 {

    public void method(int a){
        System.out.println("C");
    }
    public static void main(String[] args) {

QuizTest ob = new QuizTest();
ob.method();


    }
}
