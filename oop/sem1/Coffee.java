package oop.sem1;

public class Coffee extends HotDrink {

    public Coffee (String name, String type, int volume, int temperature) {
        super(name, type, volume, temperature);
    }

    public String toString() {
        return String.format("%s %s %d %d", name, type, volume, temperature);
    }
}
