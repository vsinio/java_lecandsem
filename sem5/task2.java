package sem5;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        Map<String, Integer> personal = new HashMap<>();

        // adding value into the list
        people.add("Иван");
        people.add("Александр");
        people.add("Иван");
        people.add("Катя");
        people.add("Александр");
        people.add("Иван");
        people.add("Иван");

        int count = 0;
        for (String name : people) {
            System.out.println(name);
        }

        System.out.println();

        Collections.sort(people);
        String temp = people.get(0);
        for (int i = 0; i < people.size(); i++)
            if (temp.equals(people.get(i))) {
                count++;
            } else {
                personal.put(temp, count);
                temp = people.get(i);
                count = 1;
                if (i == people.size() - 1)
                    personal.put(temp, count);

            }

        System.out.println(personal);
        System.out.println(sortByValues(personal));

    }
    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}