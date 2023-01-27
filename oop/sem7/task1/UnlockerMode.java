package oop.sem7.task1;

public class UnlockerMode implements Unlocker{

    private int mode;

    public void setMode(int mode) {
        this.mode = mode;
    }

    @Override
    public void unlockerConfirmation() {
        System.out.println("Ok Mode");;
    }
}