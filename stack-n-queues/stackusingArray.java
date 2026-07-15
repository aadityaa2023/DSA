public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("stack elements");
        stack.display();
        
        stack.pop();
        System.out.println("After pop");
        stack.display();

    }
}
class Stack {
    int[] arr;
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
