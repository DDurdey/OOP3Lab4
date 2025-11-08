package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A generic list implementation that wraps an ArrayList and provides
 * standard list operations. Implements Iterable to allow for-each iteration.
 *
 * @param <E> the type of elements in this list
 */
public class MyAList<E> implements Iterable<E> {
    private ArrayList<E> list;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyAList() {
        this.list = new ArrayList<>();
    }

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param initialCapacity the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity is
     *                                  negative
     */
    public MyAList(int initialCapacity) {
        this.list = new ArrayList<>(initialCapacity);
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param item element to be appended to this list
     */
    public void add(E item) {
        list.add(item);
    }

    /**
     * Appends all elements from the specified MyAList to the end of this list,
     * in the order they are returned by the specified list's iterator.
     *
     * @param items the list containing elements to be added to this list
     * @throws NullPointerException if the specified list is null
     */
    public void addAll(MyAList<E> items) {
        for (E item : items) {
            this.list.add(item);
        }
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 ||
     *                                   index >= size())
     */
    public E get(int index) {
        return list.get(index);
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the element to be removed
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 ||
     *                                   index >= size())
     */
    public void remove(int index) {
        list.remove(index);
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param item  element to be stored at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 ||
     *                                   index >= size())
     */
    public void set(int index, E item) {
        list.set(index, item);
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return list.size();
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence.
     *
     * @return an array containing all of the elements in this list in proper
     *         sequence
     */
    public Object[] toArray() {
        return list.toArray();
    }

    /**
     * Removes all of the elements from this list. The list will be empty after this
     * call returns.
     */
    public void clear() {
        list.clear();
    }

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}