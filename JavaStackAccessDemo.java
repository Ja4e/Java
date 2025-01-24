import java.util.Stack;

public class JavaStackAccessDemo {
    public static void main(String[] args) {
        // Create and populate a stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Initial Stack: " + stack);

        // 1. Accessing the top element using peek()
        System.out.println("\nAccessing the top element using peek():");
        System.out.println("Top element: " + stack.peek()); // Does not remove it

        // 2. Accessing and removing elements using pop()
        System.out.println("\nAccessing and removing elements using pop():");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
            System.out.println("Stack after pop: " + stack);
        }

        // Re-populate the stack for further demonstration
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("\nRepopulated Stack: " + stack);

        // 3. Iterating through the stack using a for-each loop
        System.out.println("\nIterating through the stack using a for-each loop:");
        for (int element : stack) {
            System.out.println("Element: " + element);
        }

        // 4. Accessing elements by index (not recommended but possible)
        System.out.println("\nAccessing elements by index:");
        for (int index = 0; index < stack.size(); index++) {
            System.out.println("Element at index " + index + ": " + stack.get(index));
        }
    }
}
