package charAtTest;

public class Main {
    public static void main(String[] args) {
        String s = "abcd";
        for ( char c : s.toCharArray() ) {
            System.out.println(c-'0');
        }
    }
}
