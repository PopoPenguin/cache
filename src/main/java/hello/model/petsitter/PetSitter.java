package hello.model.petsitter;

import hello.model.petsitter.Cat;
import hello.model.petsitter.Dog;

import java.util.ArrayList;

/**
 * Created by ryandesmond on 11/2/17.
 */
public class PetSitter {

    String name;
    double hourlyRatePerAnimal;
    ArrayList<Dog> dogs;
    ArrayList<Cat> cats;

    public PetSitter() {
        dogs = new ArrayList();
        cats = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRatePerAnimal() {
        return hourlyRatePerAnimal;
    }

    public void setHourlyRatePerAnimal(double hourlyRatePerAnimal) {
        this.hourlyRatePerAnimal = hourlyRatePerAnimal;
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void setCats(ArrayList<Cat> cats) {
        this.cats = cats;
    }
}
