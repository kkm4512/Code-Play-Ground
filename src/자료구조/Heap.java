package 자료구조;

import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(1);
        heap.add(3);
        heap.add(2);
        System.out.println(heap.poll());
    }

}
