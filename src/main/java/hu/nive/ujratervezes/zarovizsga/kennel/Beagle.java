package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    private String name;
    private int happiness;

    public Beagle(String name) {
        super(name);
        this.happiness = 0;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHappiness() {
        return this.happiness;
    }

    @Override
    void feed() {
        this.happiness = +2;
    }

    @Override
    void play(int hours) {
        this.happiness =+ (hours*2);
    }
}
