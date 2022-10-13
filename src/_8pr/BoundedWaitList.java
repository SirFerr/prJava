package _8pr;

public class BoundedWaitList<E> {
    int Capacity;
    public BoundedWaitList(int capacity){}

    public int getCapacity() {
        return Capacity;
    }
    public void add (E element){}

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "Capacity=" + Capacity +
                '}';
    }
}
