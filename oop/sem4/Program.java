package oop.sem4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        IsEven approverEven = new IsEven();
        IsPositive approverPos = new IsPositive();
        BeginsWIthA approverA = new BeginsWIthA();
        BeginsWith approverWith = new BeginsWith("All");

        List<Integer> listInt = new ArrayList<>(Arrays.asList(23, 33, 44, -1, 8, 65, 50, - 16));
        List<String> listString = new ArrayList<>(Arrays.asList("All", "spring", "fool"));

        Iterable<Integer> result = filter(listInt, approverEven);
        Iterable<String> result2 = filter(listString, approverA);
        System.out.println(result);
        System.out.println(result2);
    }

    public static <T> Iterable<T> filter(Iterable<T> collection, IsGood<T> approver) {
        Iterable<T> resultColl = collection;
        Iterator<T> iter = resultColl.iterator();
        while (iter.hasNext())  {
            if(!(approver.isGood(iter.next()))) {
                iter.remove();
            }
        }
        return resultColl;
    }
}