package replits;

public class Country {

    String name;
    String continent;
    Long population;
    boolean nearWater;

    public Country(String name) {
        this.name = name;
    }

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }
    public Country(String name, String continent, Long population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }

    public Country(String name, String continent, Long population, boolean nearWater) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.nearWater = nearWater;
    }



}
