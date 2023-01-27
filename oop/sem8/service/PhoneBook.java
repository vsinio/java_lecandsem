package oop.sem8.service;


import oop.sem8.data.Company;
import oop.sem8.data.ContactMain;

import java.util.LinkedList;

public class PhoneBook{

    private LinkedList<ContactMain> lst;

    public PhoneBook() {
        this.lst = new LinkedList<>();
    }

    public LinkedList<ContactMain> getLst() {
        return lst;
    }


    @Override
    public String toString() {
        String res = "";
        for (Object elem : lst) {
            res = res + elem + "\n";
        }
           return res;
    }

}