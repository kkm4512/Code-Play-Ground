package 가시성;

public class Main {

    public volatile static int count = 0;            // 캐시 메모리 사용 X --> 가시성 해결

    public static synchronized void add() {
        count++;
    }

    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.start();
        t2.start();

        while (t1.isAlive() || t2.isAlive()) ;            // t1, t2 스레드 종료될 때까지 대기
        System.out.println(count);            // count 변수값 출력
    }
}

class Test extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Main.add();
        }
    }
}
