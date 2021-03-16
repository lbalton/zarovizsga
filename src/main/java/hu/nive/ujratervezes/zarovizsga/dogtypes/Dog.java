package hu.nive.ujratervezes.zarovizsga.dogtypes;

public class Dog {

    private String name;

    private int happiness;

    public Dog(String name) {
        this.name = name;
        this.happiness = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    void feed(){}

    void play(int hours){}


}
