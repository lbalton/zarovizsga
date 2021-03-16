package hu.nive.ujratervezes.zarovizsga.dogtypes;

public class Beagle extends Dog{

    private String name;
    private int happiness;

    public Beagle(String name, String name1, int happiness) {
        super(name);
        this.happiness = 0;
    }

    @Override
    void feed() {
        this.happiness =+2;
    }

    @Override
    void play(int hours) {
        this.happiness =+ hours*2;
    }
}
