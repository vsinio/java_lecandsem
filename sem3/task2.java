package sem3;

import java.util.ArrayList;
import java.util.Iterator;

public class task2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(58);
        arr.add(34);
        arr.add(14);
        arr.add(83);

        System.out.println(arr);

        Iterator<Integer> col = arr.iterator();
        while (col.hasNext()) {
            int y = (Integer)col.next();
            if(y % 2 == 0) col.remove();
        }
        System.out.println("needed List: ");
        System.out.println(arr);

    }
}