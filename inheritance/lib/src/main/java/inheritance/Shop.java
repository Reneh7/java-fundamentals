package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends CommonMethods {

    private String description;
    private int numberOfDollarSigns;

    public Shop(String name,String description,int numberOfDollarSigns) {
        super(name);
        this.description=description;
        this.numberOfDollarSigns=numberOfDollarSigns;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                ", stars=" + stars +
                '}';
    }
}
