package day11_SwitchStatements;

public class SelectedBrowser {
    public static void main(String[] args) {


        String browserName= "opera";
        switch (browserName){
            case "chrome": System.out.println(browserName); break;
            case "firefox":System.out.println(browserName);break;
            case "opera":  System.out.println(browserName);break;
            case "safari":
                System.out.println(browserName);break;
            case "edge":
                System.out.println(browserName);break;
            default:
                System.err.println("Invalid Browser");

        }


    }
}
