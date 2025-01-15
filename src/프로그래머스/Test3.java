package 프로그래머스;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        int[] tangerine = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        Map<Integer,Integer> rank = new HashMap<>();
        for ( int i : tangerine ) {
            rank.put( i, rank.getOrDefault(i,0) + 1 );
        };

        List<Integer> rankDesc = new ArrayList<>(rank.values());
        rankDesc.sort(Comparator.reverseOrder());
        System.out.println(rankDesc);
    }
}
