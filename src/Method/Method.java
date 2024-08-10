package Method;

public class Method {
    /**
     * 1. 인스턴스 메서드 -> 클래스 메서드 (접근 가능)
     * 2. 인스턴스 메서드 -> 인스턴스 메서드 (접근 가능)
     * 3. 클래스 메서드 -> 인스턴스 메서드 (**접근 불가능**)
     * 4. 클래스 메서드 -> 클래스 메서드 (접근 가능
     */
    public void sayHello(){
        System.out.println("Hello World");
    }

    public static void saidHello(){
        System.out.println("Helloed World");
    }
}
