package oop.sem5;

import java.util.List;

import oop.sem5.date.Student;

public class AttandanceView { 

    public void printResult(List<Student> lst) {
        for (Object elem : lst) {
            System.out.println(elem);
        }
    }
    
}