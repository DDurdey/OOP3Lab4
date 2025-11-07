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

	@Override
	public Iterator<E> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
