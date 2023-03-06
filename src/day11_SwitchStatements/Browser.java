package day11_SwitchStatements;

public class Browser {
    public static void main(String[] args) {
        String browserName = "opera";
        String text = " Browser is selected";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari") {
            if (browserName == "chrome") {
                System.out.println(browserName + text);
            } else if (browserName == "firefox") {
                System.out.println(browserName + text);
            } else if (browserName == "opera") {
                System.out.println(browserName + text);
            } else {
                System.out.println("opera" + text);
            }

        } else System.out.println("İnvalid browser name");
    }
}