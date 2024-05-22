import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    // Test pushing elements onto the stack
    stack.push(1);
    stack.push(2);
    stack.push(3);

    // Test peeking the top element
    System.out.println("Peek top element: " + stack.peek()); // Should print 3

    // Test popping elements off the stack
    System.out.println("Pop element: " + stack.pop()); // Should print 3
    System.out.println("Pop element: " + stack.pop()); // Should print 2

    // Test the size of the stack
    System.out.println("Current stack size: " + stack.size()); // Should print 1

    // Test if the stack is empty
    System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false

    // Pop the last element
    System.out.println("Pop element: " + stack.pop()); // Should print 1

    // Test if the stack is empty after popping all elements
    System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true

    // Test exception when popping from empty stack
    try {
      stack.pop();
    } catch (java.util.EmptyStackException e) {
      System.out.println("Caught exception: " + e);
    }

    // Test exception when peeking from empty stack
    try {
      stack.peek();
    } catch (java.util.EmptyStackException e) {
      System.out.println("Caught exception: " + e);
    }
  }
}
