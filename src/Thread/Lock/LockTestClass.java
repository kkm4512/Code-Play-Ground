package Thread.Lock;

public class LockTestClass {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        LockTestClass lockTestClass = new LockTestClass();
        Runnable test1 = () -> {
            lockTestClass.methodA();
        };

        Runnable test2 = () -> {
            lockTestClass.methodB();
        };

        new Thread(test1).start();
        new Thread(test2).start();
    }

    public void methodA() {
        synchronized (lock1) {
            methodB();
        }
    }

    public void methodB() {
        synchronized (lock2) {
            // do something
            methodA();
        }
    }
}


