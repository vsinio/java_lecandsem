package oop.sem4;

public class IsPositive implements IsGood<Integer>{

    @Override
    public boolean isGood(Integer arg) {
        return arg > 0;
    }
}