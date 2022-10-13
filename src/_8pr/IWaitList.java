package _8pr;

import java.util.Collection;

public interface IWaitList<E> {
    default void add(E element){
    }
    default E remove(){}
    default boolean contains(E element){}
    default boolean containsAll(Collection<E> c){}
    default boolean isEmpty(){}

}
