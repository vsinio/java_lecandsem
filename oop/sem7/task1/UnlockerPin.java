package oop.sem7.task1;

public class UnlockerPin implements Unlocker{

    private int pin;
    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlockerConfirmation() {
        System.out.println("Ok PIN");;
    }

}