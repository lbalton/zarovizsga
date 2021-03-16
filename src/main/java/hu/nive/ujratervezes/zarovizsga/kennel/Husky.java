package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    private String name;
    private int happiness;

    public Husky(String name) {
        super(name);
        this.happiness = 0;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHappiness() {
        return happiness;
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
