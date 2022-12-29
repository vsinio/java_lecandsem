package oop.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("Vanya", 22, 4.1f));
        lst.add(new Student("Petya", 21, 3.5f));
        lst.add(new Student("Nino", 33, 2.0f));
        lst.add(new Student("Sema", 18, 4.7f));

    
        StudentsGroup sg = new StudentsGroup(lst);

    
        Iterator<Student> it = sg.iterator();

    
        while(it.hasNext()){
            System.out.println(it.next());
        }
        

        System.out.println("------------------------------");

        ListIterator<Student> listIt = sg.listIterator();

  
        while(listIt.hasNext()){
            System.out.println(listIt.nextIndex() + "\n" + listIt.next());
        }

        System.out.println("---------------------------");
        ListIterator<Student> listIt2 = sg.listIterator();

 
        while(listIt2.hasPrevious()){
            System.out.println("Index is: " + listIt2.previousIndex() +  "\n" + listIt2.previous() + "\n" );
        }

        System.out.println("---------------------------");


        ReverseIterator rt = new ReverseIterator(sg);
        while(rt.hasNext()) {
            System.out.println("Index is: " + rt.getIndex() + "\n" + rt.next());
        }
    }
}
