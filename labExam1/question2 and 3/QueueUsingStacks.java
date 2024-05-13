package question2;
	public class QueueUsingStacks {
	    private int[] stack1; // For enqueue operation
	    private int[] stack2; // For dequeue operation
	    private int top1; // Top index of stack1
	    private int top2; // Top index of stack2

	    public QueueUsingStacks(int capacity) {
	        stack1 = new int[capacity];
	        stack2 = new int[capacity];
	        top1 = -1;
	        top2 = -1;
	    }

	    public void enqueue(int value) {
	        if (top1 == stack1.length - 1) {
	            System.out.println("Queue is full. Enqueue operation failed.");
	            return;
	        }

	        while (top1 >= 0) {
	            int element = stack1[top1];
	            top1--;
	            top2++;
	            stack2[top2] = element;
	        }

	        top1++;
	        stack1[top1] = value;

	        while (top2 >= 0) {
	            int element = stack2[top2];
	            top2--;
	            top1++;
	            stack1[top1] = element;
	        }
	    }

	    public int dequeue() {
	        if (top1 == -1) {
	            System.out.println("Queue is empty. Dequeue operation failed.");
	            return -1;
	        }

	        int element = stack1[top1];
	        top1--;
	        return element;
	    }

	    public int peek() {
	        if (top1 == -1) {
	            System.out.println("Queue is empty. Peek operation failed.");
	            return -1;
	        }

	        return stack1[top1];
	    }

	    public boolean isEmpty() {
	        return top1 == -1;
	    }

	    public int size() {
	        return top1 + 1;
	    }

	    public static void main(String[] args) {
	        QueueUsingStacks queue = new QueueUsingStacks(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        System.out.println("Dequeued element: " + queue.dequeue()); // Should output 10
	        System.out.println("Peeked element: " + queue.peek()); // Should output 20
	        queue.enqueue(40);
	        queue.enqueue(50);
	        System.out.println("Is queue empty? " + queue.isEmpty()); // Should output false
	        System.out.println("Queue size: " + queue.size()); // Should output 4
	    }
	}


