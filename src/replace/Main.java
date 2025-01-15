package replace;

public class Main {
    public static void main(String[] args) {
        String s = " gi 반 갑 습니 다 ";
        s = s.replace(" ","");
        System.out.println(s);
        String c = "4";
        int number = Integer.parseInt(c);
        String d = Integer.toBinaryString(number);
        System.out.println(d);
    }
}
