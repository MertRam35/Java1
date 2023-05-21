package reviews.week_12.ınheritance.TASK;

public class MobileApp {

    public String name;
    public  double version;

    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public  void useTheApp(int minutes){
        System.out.println("Using app for "+ minutes+" minutes");
    }

    public void download() {
        System.out.println("App is downloaded");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" { " +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
/*             instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following subclasses of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)

            3. Youtube:
                    extra methods:
                      watchVideo(String video)*/