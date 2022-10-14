package _8pr;

public class UnfairWaitList<E> extends WaitList<E>{

    public E remove() {
       return deque.remove();
    }

    public void moveToBack(E element){
        deque.remove(element);
        deque.add(element);
    }
}
