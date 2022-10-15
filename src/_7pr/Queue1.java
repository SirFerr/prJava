package _7pr;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Queue1 {
    public static void Queue1() {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        Queue<Integer> d1 = new ConcurrentLinkedQueue<>() {
        }, d2 = new ConcurrentLinkedQueue<>();
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
            if (d1.peek() > d2.peek() || ((d1.peek() == 0) && (d2.peek() == 9))) {
                d1.add(d1.peek());
                d1.add(d2.peek());
            } else if (d1.peek() < d2.peek() || ((d1.peek() == 9) && (d2.peek() == 0))) {
                d2.add(d2.peek());
                d2.add(d1.peek());
            }
            d1.remove();
            d2.remove();

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
