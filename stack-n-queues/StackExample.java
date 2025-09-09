import java.util.*;

class StackExample{
    public static void main(String []args){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println("Stack is "+ stack);

        stack.pop();
        stack.pop();

        System.out.println("New stack after removal is "+ stack);




    }
}