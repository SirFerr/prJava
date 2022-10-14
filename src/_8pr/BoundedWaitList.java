package _8pr;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public void add (E element){
        if (deque.size()<=capacity){
            deque.add(element);
        }else
        System.out.println("wait list is full");
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", deque=" + deque +
                '}';
    }
}
