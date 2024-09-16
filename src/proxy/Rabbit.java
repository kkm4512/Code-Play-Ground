package proxy;

public class Rabbit implements Animal {
    @Override
    public void eat() {
        System.out.println("토끼가 먹습니다");
    }

    @Override
    public void drink() {
        System.out.println("토끼가 마십니다");
    }
}
