package oop.sem5;

import java.util.ArrayList;
import java.util.List;

import oop.sem5.date.Student;

public class Controller { 
    AttandanceService aService;
    AttandanceView aView;

    public Controller() {
        this.aService = new AttandanceService();
        this.aView = new AttandanceView();
    }

    public List<Student> getsGroup() { 

        List<Student> copy = new ArrayList<>();
        copy = aService.getsGroup();
        List<Student> studentsList = new ArrayList<>();
        for (Student student : copy) {
            studentsList.add(student);
        }
        return studentsList;
    }

    public List<Student> sortStudensGroup() { 

        List<Student> copy = new ArrayList<>();
        copy = aService.getsGroup();
        Student temp;
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = i + 1; j < copy.size(); j++) {
                if (copy.get(i).attInPercents() < copy.get(j).attInPercents()) {
                    temp = copy.get(j);
                    copy.set(j, copy.get(i));
                    copy.set(i, temp);
                }
            }
        }
        return copy;
    }

    public List<Student> filterStudents(float param) {
        List<Student> copy = new ArrayList<>();
        copy = aService.getsGroup();
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i).attInPercents() <= param) {
                result.add(copy.get(i));
            }
        }
        return result;

    }

    public AttandanceService getaService() {
        return aService;
    }

    public AttandanceView getaView() {
        return aView;
    }

}
