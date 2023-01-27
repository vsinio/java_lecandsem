package oop.sem7.task1;


public class UnlockerFingerprint implements Unlocker{

    private String fingerprint; 

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }


    @Override
    public void unlockerConfirmation() {
        System.out.println("Finger Print OK");;
    }
}