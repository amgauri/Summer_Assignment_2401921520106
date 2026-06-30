package WEEK3.Day5;

    import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> calls;

    public RecentCounter() {
        calls = new ArrayDeque<>();
    }

    public int ping(int t) {
        calls.offer(t);

        while (calls.peek() < t - 3000) {
            calls.poll();
        }

        return calls.size();
    }

    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));
    }
}

