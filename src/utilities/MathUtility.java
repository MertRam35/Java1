package utilities;

public class MathUtility {

    public static int sumTwoInt(int num1, int num2){

        int result = 0;
        result = num1 + num2;
        return result;
    }



    public static void main(String[] args) {
        int num= 25, numb = 68;
        int result =sumTwoInt(num,numb);

        System.out.println("result = " + result);
    }

}
