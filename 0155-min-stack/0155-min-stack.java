import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;     // normal stack to store values
    private Stack<Integer> minStack;  // stack to keep track of minimums

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto stack
    public void push(int val) {
        stack.push(val);

        // If minStack is empty OR current value <= current min
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val); // store it as new minimum
        }
    }

    // Remove top element
    public void pop() {
        int removed = stack.pop();

        // If removed element is equal to current minimum
        if (removed == minStack.peek()) {
            minStack.pop(); // remove from minStack also
        }
    }

    // Get top element
    public int top() {
        return stack.peek();
    }

    // Get minimum element in O(1)
    public int getMin() {
        return minStack.peek();
    }
}