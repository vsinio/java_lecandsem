package oop.sem4;

public class BeginsWIthA implements IsGood<String>{

    @Override
    public boolean isGood(String arg) {
        return arg.startsWith("A");
    }
}