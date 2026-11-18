import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("C");
        queue.offer("F");
        queue.offer("B");
        queue.offer("D");

        System.out.println(queue.isEmpty());
        System.out.println(queue);
        System.out.println(queue.peek());



    }
}
