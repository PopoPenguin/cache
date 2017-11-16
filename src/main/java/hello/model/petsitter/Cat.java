package hello.model.petsitter;

/**
 * Created by ryandesmond on 11/2/17.
 */
public class Cat {

    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
