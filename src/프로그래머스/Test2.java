package 프로그래머스;


import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;
        int k = 6;
        int[] tangerine = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i : tangerine ) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());
        for ( int v : list ) {
            if ( sum + v == k ) {
                cnt++;
                break;
            } else {
                sum += v;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
