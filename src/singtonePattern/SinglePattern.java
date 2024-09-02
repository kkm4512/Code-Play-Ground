package singtonePattern;

public class SinglePattern {
    private static SinglePattern singlePattern = new SinglePattern();

    private SinglePattern() {}

    public static SinglePattern getInstance() {
        return singlePattern;
    }

    public void hello(){
        System.out.println("gd");
    }

}
