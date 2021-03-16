package hu.nive.ujratervezes.zarovizsga.dogtypes;

public class Husky extends Dog{

    private String name;
    private int happiness;

    public Husky(String name,int happiness) {
        super(name);
        this.happiness = 0;
    }
}
