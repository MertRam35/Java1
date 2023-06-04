package reviews.week_14.abstraction;

public abstract class Phone {
String brand;
String color;

    public Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    abstract void text();
    abstract void call(String name);



}
