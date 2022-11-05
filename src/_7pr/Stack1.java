package _7pr;
import java.util.Scanner;
import java.util.Stack;
public class Stack1 {

    public static void Stack() {
//        Scanner in = new Scanner(System.in);
        int[] a1 = {1, 3, 5, 7, 2};
        int[] a2 = {2, 4, 9, 8, 0};
        Stack<Integer> d1 = new Stack<Integer>(),
                d2 = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            d1.add(a1[i]);
        }
        for (int i = 0; i < 5; i++) {
            d2.add(a2[i]);
        }
//        in.close();
        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (d1.get(0) > d2.get(0) || ((d1.get(0) == 0) && (d2.get(0) == 9))) {
                d1.add(d1.get(0));
                d1.add(d2.get(0));
            } else if (d1.get(0) < d2.get(0) || ((d1.get(0) == 9) && (d2.get(0) == 0))) {
                d2.add(d2.get(0));
                d2.add(d1.get(0));
            }
            d1.remove(0);
            d2.remove(0);

            if (d1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (d2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }

}
