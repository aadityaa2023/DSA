
import java.util.*;

class QueueExample{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(6);
        queue.add(7);
        queue.add(8);

        System.out.println("Queue is "+ queue);

        queue.poll();
        queue.remove();
        
        System.out.println("Queue is "+ queue);






    }
}