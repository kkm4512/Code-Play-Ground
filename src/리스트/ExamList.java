package 리스트;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExamList {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i=0; i<10000000; i++ ) {
            linkList.add(i);
            list.add(i);
        }

        long start = System.nanoTime();
        linkList.add(555555,99);
        long end = System.nanoTime();
        System.out.println("링크 리스트 중간삽입 시간" + (end - start) + "ns");
        start = System.nanoTime();
        list.add(555555,99);
        end = System.nanoTime();
        System.out.println("일반 리스트 중간삽입 시간" + (end - start) + "ns");

    }
}
