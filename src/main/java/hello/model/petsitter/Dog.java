package hello.model.petsitter;

/**
 * Created by ryandesmond on 11/2/17.
 */
public class Dog {

    String breed;
    String size;
    Collar collar;

    public Dog(String breed, String size, Collar collar) {
        this.breed = breed;
        this.size = size;
        this.collar = collar;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }
}
