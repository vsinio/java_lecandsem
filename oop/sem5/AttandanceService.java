package oop.sem5;

import java.util.List;

import oop.sem5.date.*;

public class AttandanceService {

    private StudentsGroup sGroup = new StudentsGroup();

    public AttandanceService() {
        sGroup.addStudentInGroup(new Student("Ivanov", "Vasiliy"));
        sGroup.addStudentInGroup(new Student("Petrov", "Evklid"));
        sGroup.addStudentInGroup(new Student("Amarov", "Karen"));
        sGroup.addStudentInGroup(new Student("Kluny", "Djorge"));
        sGroup.addStudentInGroup(new Student("Sean", "Poll"));
    }

    @Override
    public String toString() {
        return sGroup.toString();
    }

    public List<Student> getsGroup() {
        List<Student> copyStudentsGroup = sGroup.getStList();
        return copyStudentsGroup;
    }

}