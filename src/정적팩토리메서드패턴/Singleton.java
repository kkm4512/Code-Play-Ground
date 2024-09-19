package 정적팩토리메서드패턴;

public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if ( instance == null ) {
            instance = new Singleton();
        }
        return instance;
    }
}
