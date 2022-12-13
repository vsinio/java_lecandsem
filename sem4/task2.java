package sem4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(7);
        ll.add(87);
        ll.add(7);
        ll.add(4);

        System.out.printf("Перевернутый %s\n ", enqueue(ll, 3));
        System.out.printf("элемент в конце %s\n ", dequeue(ll));
        System.out.printf("элемент в начале %s\n ", first(ll));
    }

    private static LinkedList<Integer> enqueue(LinkedList<Integer> list, int i) {
        list.addLast(list.remove(i));
        return list;
    }

    private static Integer dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    private static int first(LinkedList<Integer> list) {
        return (int) list.getFirst();
    }
}