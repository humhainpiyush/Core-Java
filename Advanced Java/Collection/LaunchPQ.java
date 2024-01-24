
//Priority Queue follows the min-heap algorithm and Complete Binary Tree DataStructure

import java.util.PriorityQueue;
public class LaunchPQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(200);
        pq.add(175);
        pq.add(50);
        pq.add(100);
        pq.add(75);
        pq.add(25);
        pq.add(150);
        pq.add(125);

        System.out.println(pq);
    }
}