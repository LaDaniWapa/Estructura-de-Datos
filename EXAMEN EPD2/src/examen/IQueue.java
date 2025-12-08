package examen;

public interface IQueue<E> {
    /**
     * Returns true if this queue contains the specified element.
     * @param o element whose presence in this queue is to be tested
     * @return true if this queue contains the specified element
     */
    boolean find(E o);

    /**
     * Retrieves and removes the head of this queue.
     * @return the head of this queue
     * @throws EmptyQueueException if this queue is empty
     */
    E dequeue() throws EmptyQueueException;

    /**
     * Inserts the specified element into this queue.
     * @param o the element to add
     */
    void enqueue(E o);

    /**
     * Retrieves, but does not remove, the head of this queue.
     * @return the head of this queue
     * @throws EmptyQueueException if this queue is empty
     */
    E front() throws EmptyQueueException;

    /**
     * Returns true if this queue contains no elements.
     * @return true if this queue contains no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this queue.
     * @return the number of elements in this queue
     */
    int size();
}
