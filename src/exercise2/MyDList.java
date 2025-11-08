package exercise2;

/**
 * A doubly linked list implementation.
 * 
 * @author [Your Name] - Constructor, getHead(), addFirst(), addLast()
 * @author [Your Friend's Name] - removeFirst(), removeLast(), size(), isEmpty()
 * @param <E> the type of elements in this list
 */
public class MyDList<E>
{
  private MyNode<E> head;
  private MyNode<E> tail;
  private int size;

  /**
   * Constructor to create an empty doubly linked list.
   * 
   * @author [Your Name]
   */
  public MyDList()
  {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  /**
   * Gets the head (first node) of the list.
   * 
   * @author [Your Name]
   * @return the head node, or null if the list is empty
   */
  public MyNode<E> getHead()
  {
    return head;
  }

  /**
   * Adds an element to the beginning of the list.
   * 
   * @author [Your Name]
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
   * 
   * @author [Your Name]
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
   * 
   * @author [Your Friend's Name]
   * @return the removed element
   * @throws RuntimeException if the list is empty
   */
  public E removeFirst()
  {
    // TODO: Person 2 will implement this
    return null;
  }

  /**
   * Removes and returns the last element of the list.
   * 
   * @author [Your Friend's Name]
   * @return the removed element
   * @throws RuntimeException if the list is empty
   */
  public E removeLast()
  {
    // TODO: Person 2 will implement this
    return null;
  }

  /**
   * Returns the number of elements in the list.
   * 
   * @author [Your Friend's Name]
   * @return the size of the list
   */
  public int size()
  {
    // TODO: Person 2 will implement this
    return size;
  }

  /**
   * Checks if the list is empty.
   * 
   * @author [Your Friend's Name]
   * @return true if the list is empty, false otherwise
   */
  public boolean isEmpty()
  {
    // TODO: Person 2 will implement this
    return size == 0;
  }
}
