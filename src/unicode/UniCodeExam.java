package unicode;

import java.nio.charset.StandardCharsets;

public class UniCodeExam {
    public static void main(String[] args) {
        int i = 1100;
        char c = (char) i;

        // 강제로 UTF-16 설정
        System.out.println(new String(new char[]{c}).getBytes(StandardCharsets.UTF_16).toString());
        System.out.println(c);  // 정상적으로 'ㄱ' 출력
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
