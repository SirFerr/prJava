package _8pr;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements BoundedWaitList,UnfairWaitList{
    ConcurrentLinkedQueue<E> content;
    public WaitList(){}
    public WaitList(Collection<E> c){}

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
