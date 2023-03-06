package day19Loops;

public class task2 {

    public static void main(String[] args) {
        double width = 5.6, height = 8.5;

        double area = width*height;
        double perimeter = 2*(width+height);

        System.out.println( "Area is "+width+" * "+height+" = "+area);
        System.out.println("perimeter is 2*("+width+" + "+height+") = " + perimeter);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", width, width, perimeter);
    }
}
