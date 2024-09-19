package 정적팩토리메서드패턴;

public class Main {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        System.out.println(i1 == i2);
        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        System.out.println(i3 == i4);
    }
}
