package bitmask;

public class BitmaskExample {
    public static void main(String[] args) {
        // {0, 1, 2, 3, 4}를 정수 31로 표현 (2진수: 11111)
        byte subset = 19;  // 2진수: 11111 (각 비트가 인덱스를 의미)

        System.out.println("정수 31의 2진수 표현: " + Integer.toBinaryString(subset));

        // 포함된 요소 출력 (비트마스크 해제)
        System.out.print("포함된 요소: ");
        for (int i = 0; i < 5; i++) {
            if ((subset & (1 << i)) != 0) {  // i번째 비트가 1인지 확인
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}

