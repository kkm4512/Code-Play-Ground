package 자료구조;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println(treeSet.pollFirst());


    }
}
