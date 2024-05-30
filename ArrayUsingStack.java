public class ArrayUsingStack {
    private int[] stack;
    private int top;

    public ArrayUsingStack(int len) {
        stack = new int[len];
        top = -1;
    }

    public void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("it is full");
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("it is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }
    public static void main(String[] args) {
        ArrayUsingStack stack = new ArrayUsingStack(7);
        stack.push(40);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
    public boolean isEmpty() {
        return top == -1;
    }
