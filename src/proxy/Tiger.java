package proxy;

public class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("호랑이가 먹습니다");
    }

    @Override
    public void drink() {
        System.out.println("호랑이가 마십니다");
    }
}
