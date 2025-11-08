package exercise2;

/**
 * A doubly linked list implementation.
 * Contributors: Person 1 (node & add operations), Person 2 (removals & checks)
 *
 * @param <E> the type of elements in this list
 */
public class MyDList<E>
{
  private MyNode<E> head;
  private MyNode<E> tail;
  private int size;

  /**
   * Constructor to create an empty doubly linked list.
   */
  public MyDList()
  {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  /**
   * Gets the head (first node) of the list.
   * @return the head node, or null if the list is empty
   */
  public MyNode<E> getHead()
  {
    return head;
  }

  /**
   * Adds an element to the beginning of the list.

   * @param item the element to add
   */
  public void addFirst(E item)
  {
    MyNode<E> newNode = new MyNode<>(item);
    
    // If the list is empty, both head and tail point to the new node
    if (head == null)
    {
      head = newNode;
      tail = newNode;
    }
    else
    {
      // Link the new node to the current head
      newNode.setNext(head);
      head.setPrev(newNode);
      // Update head to point to the new node
      head = newNode;
    }
    
    // Increment the size
    size++;
  }

  /**
   * Adds an element to the end of the list.
   * @param item the element to add
   */
  public void addLast(E item)
  {
    MyNode<E> newNode = new MyNode<>(item);
    
    // If the list is empty, both head and tail point to the new node
    if (tail == null)
    {
      head = newNode;
      tail = newNode;
    }
    else
    {
      // Link the new node to the current tail
      tail.setNext(newNode);
      newNode.setPrev(tail);
      // Update tail to point to the new node
      tail = newNode;
    }
    
    // Increment the size
    size++;
  }

  /**
   * Removes and returns the first element of the list.
   * @return the removed element
   * @throws RuntimeException if the list is empty
   */
  public E removeFirst()
  {
    if (head == null)
    {
      throw new RuntimeException("List is empty");
    }

    E element = head.getElement();

    // If only one element
    if (head == tail)
    {
      head = null;
      tail = null;
    }
    else
    {
      head = head.getNext();
      if (head != null)
      {
        head.setPrev(null);
      }
    }

    size--;
    return element;
  }

  /**
   * Removes and returns the last element of the list.
   * @return the removed element
   * @throws RuntimeException if the list is empty
   */
  public E removeLast()
  {
    if (tail == null)
    {
      throw new RuntimeException("List is empty");
    }

    E element = tail.getElement();

    // If only one element
    if (head == tail)
    {
      head = null;
      tail = null;
    }
    else
    {
      tail = tail.getPrev();
      if (tail != null)
      {
        tail.setNext(null);
      }
    }

    size--;
    return element;
  }

  /**
   * Returns the number of elements in the list.
   * @return the size of the list
   */
  public int size()
  {
    return size;
  }

  /**
   * Checks if the list is empty.
   * @return true if the list is empty, false otherwise
   */
  public boolean isEmpty()
  {
    return size == 0;
  }
}