package set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] reports = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        /**
         [ 문제이해 ]
         1. 각 유저는 각 유저에 대해 한번씩만 신고가능
         2. x유저가 신고를 하고, y유저가 정지되었다면 x유저에게 이메일이 발송됨
         3. 각 유저들에 대해 이메일이 몇개 발송될지 return 하시오
         */

        /**
         [ 코드풀이 ]
         - int[4] result 배열선언
         - 그럼 left가 신고한사람, right가 신고당한사람이라고 가정했을때
         - Map<String, String<Set>> 형식으로갈까?
         - map.put(key,new HashSet<>()); id_list for문돌기
         - report for 문돌면서 map.put(left,map.get(left).add(right))
         - 그럼 현재 map에는 어떤사람이 누구를 신고했는지 size가 저장되어있음
         - 그럼 이제 내가해야할것은 무엇인가?
         - x가 y를 신고했을때, 그 y의 신고횟수가 k를 넘었다면 result에 1씩 추가시키기
         */

        Map<String,Integer> result = new LinkedHashMap<>();
        Map<String,HashSet<String>> map = new HashMap<>();
        for ( String id : id_list ) {
            map.put( id ,new HashSet<>() );
            result.put(id,0);
        };
        for ( String report : reports ) {
            String[] split = report.split(" ");
            String left = split[0]; // 신고한 사람
            String right = split[1]; // 신고당한 사람
            //신고 당한사람을 key로넣고, 신고한사람들을 value 로넣음
            map.get(right).add(left);
        };
        // 신고당한사람의 id를 순회함
        // 그 밸류값에는 그 사람을 누가 신고했는지 알 수 있음
        for ( String id : map.keySet() ) {
            // 누가 신고했는지
            HashSet<String> reporteds = map.get(id);
            // 신고당한 사람의 size가 k를 넘었다면
            // 신고자는 이메일을 받아야함
            if (reporteds.size() >= k) {
                // 신고한사람들의 idx++를 해줘야하기때문에 누군지 알아야해서 for문 돌기
                for ( String reporterd : reporteds ) {
                    Integer get = result.get(reporterd);
                    result.put(reporterd, ++get);
                }
            }
        }
    }
}
