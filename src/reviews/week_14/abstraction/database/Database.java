package reviews.week_14.abstraction.database;

import java.util.ArrayList;

public abstract class Database {

    protected ArrayList<String> names =new ArrayList<>();

    abstract void add(String name);

}
