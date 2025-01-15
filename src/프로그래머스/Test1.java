package 프로그래머스;

import java.util.*;

public class Test1 {
    public int solution(int n) {
        /**
         [ 문제이해 ]
         [0,1,1,2,3,5]
         ---
         2 이상의 n이 입력되었을때, n번째 피보나치 수를 1234567로 나눈 나머지를 return 하는 함수를 완성하기
         */

        /**
         [ 제한사항 ]
         n은 2이상 100,000 이하인 자연수 입니다
         */

        /**
         [ 문제풀이 ]
         1. n이 0이라면 리스트에 0을 넣고
         2. n이 1이라면 리스트에 1을 넣고
         3. n이 2라면 리스트의 n-1 + n 을해서 넣고 반복...
         */
        List<Integer> answerList = new ArrayList<>();
        for ( int i=0; i<=n; i++ ) {
            if (answerList.size() < 2) {
                answerList.add(i);
            } else {
                answerList.add( answerList.get(i-2) + answerList.get(i-1) );
            }

        }
        System.out.println(answerList.get((n)));

        return answerList.get(n) % 1234567;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.solution(1234567));
    }
}
