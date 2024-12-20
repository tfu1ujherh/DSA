class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push operation to add an element to the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = data;
    }

    // Pop operation to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    // Peek operation to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Return the size of the stack
    public int size() {
        return top + 1;
    }

    // Display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display(); // Output: 1 2 3

        System.out.println("Top element is " + stack.peek()); // Output: Top element is 3

        System.out.println("Stack size is " + stack.size()); // Output: Stack size is 3

        System.out.println("Popped element is " + stack.pop()); // Output: Popped element is 3
        stack.display(); // Output: 1 2

        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.display(); // Output: 1 2 4 5 6

        stack.push(7); // Output: Stack overflow
    }
}
