package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> players = List.of("A","B","C","D","E","F","G","H","I","J");
        int n = 5;
        int i = 0;
        List<String> current = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        numberOfCases(players,n,i,current,result);
        System.out.println(result);
    }

    public static void numberOfCases(List<String> players, int n, int i, List<String> current,List<List<String>> result) {
        if (n == current.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (i == n*2) {
            return;
        }

        current.add(players.get(i));
        numberOfCases(players,n,i+1,current,result);

        current.remove(current.size()-1);
        numberOfCases(players,n,i+1,current,result);
    }
}
