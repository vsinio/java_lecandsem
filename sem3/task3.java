package sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(5);
        arr.add(8);
        arr.add(33);
        arr.add(-14);
        arr.add(58);
        arr.add(2);
        arr.add(-2);

        System.out.println("List: ");
        System.out.println(arr);

        MinMax(arr);


    }
        public static void MinMax(ArrayList<Integer> list) {
            Iterator<Integer> col = list.iterator();
            int min = list.get(0);
            int max = list.get(0);
            double res = 0;

            while (col.hasNext()) {
                int i = (Integer)col.next();
                if (i < min) min = i;
                if (i > max) max = i;
                res = res + i;
            }

            System.out.printf("Min = %s\n", min);
            System.out.printf("Max = %s\n", max);
            System.out.printf("Average = %.2f\n", res / list.size());
        }
}
