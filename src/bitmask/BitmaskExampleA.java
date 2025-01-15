package bitmask;

public class BitmaskExampleA {
    public static void main(String[] args) {
        final int ITERATIONS = 100_000_000; // 1억번 반복
        byte A = 1;
        byte B = 1;

        // 1. 산술 연산 (* 2) 수행 시간 측정
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            int result = (A + B) * 2;
        }
        long endTime = System.nanoTime();
        System.out.println("산술 연산 (*2) 소요 시간: " + (endTime - startTime) + " 나노초");

        // 2. 비트 시프트 연산 (<< 1) 수행 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            int result = (A + B) << 1;
        }
        endTime = System.nanoTime();
        System.out.println("비트 시프트 (<<1) 소요 시간: " + (endTime - startTime) + " 나노초");

        // 3. 결과 비교
        int resultArithmetic = (A + B) * 2;
        int resultBitShift = (A + B) << 1;
        System.out.println("결과 비교 (산술 vs 비트 시프트): " + (resultArithmetic == resultBitShift));
    }
}

