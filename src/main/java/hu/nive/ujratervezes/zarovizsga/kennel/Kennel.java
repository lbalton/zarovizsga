package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {


    private List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog){
        dogs.add(dog);
    }


    public void feedAll(){
        for (Dog dog : dogs){
            dog.feed();
        }
    }

    public Dog findByName(String name){

        Dog thisDog = null;
        for (Dog dog : dogs){
            if (dog.getName().equals(name)){
                thisDog = dog;
            }throw new IllegalArgumentException("Dog not found" + name);
        }

        return thisDog;
    }
    public void playWith(String name, int hours){

        for (Dog dog : dogs){
            if (dog.getName().equals(name)){
                dog.play(hours);
            }
        }
    }

    List<String> getHappyDogNames(int minHappiness){

        List<String> happyDogs = new ArrayList<>();

        for (Dog dog : dogs){
            if (dog.getHappiness()>minHappiness){
                happyDogs.add(dog.getName());
            }
        }
        return happyDogs;
    }

}
