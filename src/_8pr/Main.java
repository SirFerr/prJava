package _8pr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<>();
        for(int i=0; i<10;i++){
            waitList.add(i);
        }
        System.out.println(waitList.contains(2));
        System.out.println(waitList.toString());
        System.out.println(waitList.remove());
        System.out.println(waitList.toString()+"\n");

        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(2);
        for(int i=0; i<4;i++) {
            boundedWaitList.add(i);
        }
        System.out.println(boundedWaitList.toString()+"\n");

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        for(int i=0; i<10;i++){
            unfairWaitList.add(i);
        }
        System.out.println(unfairWaitList.toString());
        unfairWaitList.moveToBack(2);
        System.out.println(unfairWaitList.toString());
    }
}
