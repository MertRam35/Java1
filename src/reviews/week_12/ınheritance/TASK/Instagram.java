package reviews.week_12.ınheritance.TASK;

public class Instagram extends MobileApp{
    public Instagram(String name, double version) {
        super(Instagram.class.getSimpleName(), version);
    }

     public void postPhoto(){
         System.out.println(name+ " is taking photo");

     }

    public static void main(String[] args) {
        Instagram instagram =new Instagram("ali",123);
        System.out.println(instagram);

        instagram.postPhoto();
    }
}
