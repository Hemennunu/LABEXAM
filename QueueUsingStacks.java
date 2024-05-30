public class QueueUsingStacks {
    private Stack stack1; // For enqueue operation
    private Stack stack2; // For dequeue operation

    public QueueUsingStacks() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void enqueue(int value) {
        stack1.push(value);
        System.out.println("Enqueued element: " + value);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }

        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        int value = stack2.pop();
        System.out.println("Dequeued element: " + value);
        return value;
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty. Cannot peek element.");
            return -1;
        }

        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        int value = stack2.peek();
        System.out.println("Peeked element: " + value);
        return value;
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.peek();
    }
}