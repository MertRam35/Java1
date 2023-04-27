package day41_Exceptions;

public class Exceptions {

    public static void main(String[] args) throws InterruptedException {


        try {
            method();
            Thread.sleep(3000);
            method();

        }catch (Exception e){

        }

    }
    public static final void method(){
        System.out.println("a");
    }
}
