package exercise2;

/**
 * Node class for the doubly linked list.
 * Contributors: Person 1 (node & add operations), Person 2 (removals & checks)
 */
public class MyNode<E>
{
	private E element;
	private MyNode<E> next;
	private MyNode<E> prev;

	public MyNode(E element)
	{
		this.element = element;
		this.next = null;
		this.prev = null;
	}

	public E getElement()
	{
		return element;
	}

	public MyNode<E> getNext()
	{
		return next;
	}

	public MyNode<E> getPrev()
	{
		return prev;
	}

	public void setNext(MyNode<E> next)
	{
		this.next = next;
	}

	public void setPrev(MyNode<E> prev)
	{
		this.prev = prev;
	}
}