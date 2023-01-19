package oop.sem5.date;

import java.time.LocalDate;
import java.util.*;

public class Pair {
    private LocalDate date;
    private Boolean isAttendance;
    Random r = new Random();

    public Pair() {
        date = LocalDate.now();
        isAttendance = r.nextBoolean();
    }

    @Override
    public String toString() {
        return "date = " + date + ", isAttendance = " + isAttendance + "\n";
    }


    public Boolean getIsAttendance() {
        return isAttendance;
    }

    

    

 

    

}