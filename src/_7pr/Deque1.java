package _7pr;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Deque1 {
    public static void Deque1() {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        Deque<Integer> d1 = new ConcurrentLinkedDeque<>() {
        }, d2 = new ConcurrentLinkedDeque<>();
        for (int i = 0; i < 5; i++) {
            d1.add(a1[i]);
        }
        for (int i = 0; i < 5; i++) {
            d2.add(a2[i]);
        }
        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (d1.getFirst() > d2.getFirst() || ((d1.getFirst() == 0) && (d2.getFirst() == 9))) {
                d1.add(d1.getFirst());
                d1.add(d2.getFirst());
            } else if (d1.getFirst() < d2.getFirst() || ((d1.getFirst() == 9) && (d2.getFirst() == 0))) {
                d2.add(d2.getFirst());
                d2.add(d1.getFirst());
            }
            d1.removeFirst();
            d2.removeFirst();

            if (d1.isEmpty()) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (d2.isEmpty()) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}
