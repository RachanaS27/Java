import java.util.ArrayDeque;
import java.util.Queue;

public class queueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(48);
        queue.offer(28);
        queue.offer(458);
        queue.offer(489);
        queue.offer(148);
        queue.offer(28);
        queue.offer(38);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.contains(128));
        System.out.println("is empty "+queue.isEmpty());
        System.out.println("remove "+queue.remove(28));
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());

    }
}
