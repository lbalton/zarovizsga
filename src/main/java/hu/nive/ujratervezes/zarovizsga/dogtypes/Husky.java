package hu.nive.ujratervezes.zarovizsga.dogtypes;

public class Husky extends Dog{

    private String name;
    private int happiness;

    public Husky(String name,int happiness) {
        super(name);
        this.happiness = 0;
    }

    @Override
    void feed() {
        this.happiness = +4;
    }

    @Override
    void play(int hours) {
        this.happiness =+ (hours*3);
    }
}
