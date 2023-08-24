package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends CommonMethods  {
    private int price;

    public Restaurant(String name,int stars, int price) {
        super(name);
        this.stars=Math.max(0, Math.min(5, stars));
        this.price=price;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }
}
