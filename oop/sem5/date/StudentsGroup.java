package oop.sem5.date;


import java.util.LinkedList;
import java.util.List;

public class StudentsGroup {
    private List<Student> stList = new LinkedList<>();

    public void addStudentInGroup(Student student) {
    }

    public List<Student> getStList() {
        List<Student> copy = new LinkedList<>();
        copy = stList;
        return copy;
    }

    @Override
    public String toString() {
        return stList.toString();
    }

}