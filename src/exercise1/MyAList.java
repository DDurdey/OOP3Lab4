package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

	// Constructor
    public MyAList() {
        this.list = new ArrayList<>();
    }

    // Constructor with initial capacity
    public MyAList(int initialCapacity) {
        this.list = new ArrayList<>(initialCapacity);
    }

	// Add a single item to the list
    public void add(E item) {
        list.add(item);
    }

    // Add all items from another MyAList
    public void addAll(MyAList<E> items) {
        for (E item : items) {
            this.list.add(item);
        }
    }

	// Get item at a specified index
	public E get(int index) {
		return list.get(index);
	}

	// Remove an item at a specified index
	public void remove(int index, E item) {
		list.set(index, item);
	}

	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
