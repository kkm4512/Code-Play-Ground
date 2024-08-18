package AnonymousClass;
public class Main {
    interface Music<T> {
        void play(T fileName);
    }

    public static void main(String[] args) {

        Music<String> music1 = new Music<>() {
            @Override
            public void play(String fileName) {
                System.out.println(fileName + " 재생");
            }
        };

        Music<String> music2 = (String fileName) -> {
            System.out.println(fileName + " 재생");
        };

        Music<String> music3 = fileName -> System.out.println(fileName + " 재생");

        music1.play("K-POP");
        music2.play("J-POP");
        music3.play("POP");
    }

}




