public class Main {

  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<>();

    // Test adding elements to the queue
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);

    // Test peeking the front element
    System.out.println("Peek front element: " + queue.peek()); // Should print 1

    // Test polling elements from the queue
    System.out.println("Poll element: " + queue.poll()); // Should print 1
    System.out.println("Poll element: " + queue.poll()); // Should print 2

    // Test the size of the queue
    System.out.println("Current queue size: " + queue.size()); // Should print 1

    // Test if the queue is empty
    System.out.println("Is queue empty? " + queue.isEmpty()); // Should print false

    // Poll the last element
    System.out.println("Poll element: " + queue.poll()); // Should print 3

    // Test if the queue is empty after polling all elements
    System.out.println("Is queue empty? " + queue.isEmpty()); // Should print true

    // Test exception when polling from empty queue
    try {
      queue.poll();
    } catch (RuntimeException e) {
      System.out.println("Caught exception: " + e);
    }

    // Test exception when peeking from empty queue
    try {
      queue.peek();
    } catch (RuntimeException e) {
      System.out.println("Caught exception: " + e);
    }
  }

  public static class Queue<T> implements Iterable<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<>();

    public Queue() {}

    public Queue(T firstElem) {
      offer(firstElem);
    }

    // Return the size of the queue
    public int size() {
      return list.size();
    }

    // Returns whether or not the queue is empty
    public boolean isEmpty() {
      return size() == 0;
    }

    // Peek the element at the front of the queue
    // The method throws an error if the queue is empty
    public T peek() {
      if (isEmpty()) throw new RuntimeException("Queue Empty");
      return list.peekFirst();
    }

    // Poll an element from the front of the queue
    // The method throws an error if the queue is empty
    public T poll() {
      if (isEmpty()) throw new RuntimeException("Queue Empty");
      return list.removeFirst();
    }

    // Add an element to the back of the queue
    public void offer(T elem) {
      list.addLast(elem);
    }

    // Return an iterator to allow the user to traverse
    // through the elements found inside the queue
    @Override
    public java.util.Iterator<T> iterator() {
      return list.iterator();
    }
  }
}

