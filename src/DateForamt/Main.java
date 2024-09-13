package DateForamt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
        //원하는 데이터 포맷 지정
        String strNowDate = simpleDateFormat.format(date);
        //지정한 포맷으로 변환
        System.out.println("포맷 지정 후 : " + strNowDate);
    }
}
