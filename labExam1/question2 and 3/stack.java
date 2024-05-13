package question2;

public class stack {
	static int []arrStack;
	static int top;
	int size;
	stack(int size){
		arrStack= new int[size];
		top = -1;
		this.size=size;
		}
	public void push(int value) {
		if (top==size-1) {
			System.out.println("Now,stack is full");
		}else {
			arrStack[++top]=value;
		}
	}
	public int pop() {
		if (top==-1) {
		   return -1;
		}else {
			return arrStack[top--];
		}
	}

	public static void main(String[] args) {
	
		stack myStack = new stack(3);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.pop();
		  System.out.println("Stack elements: ");
	       for (int i = top; i >= 0; i--) {
	            System.out.println(arrStack[i]);
		
		

	}

	}
}
