package reviews.week_12.ınheritance.TASK;

public class Discord extends MobileApp{
    public Discord(String name, double version) {
        super("Discord", version);
    }
    public void chat(String name){
        System.out.println("discord "+name);

    }
}
