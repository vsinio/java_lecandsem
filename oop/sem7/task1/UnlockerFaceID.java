package oop.sem7.task1;

public class UnlockerFaceID implements Unlocker{
    private String faceID;

    public void setFaceID(String faceID) {
        this.faceID = faceID;
    }


    @Override
    public void unlockerConfirmation() {
        System.out.println("Face ID OK");;
    }
}