package SOLID;

public class Main {

    public static void main(String[] args) {
        GuitarManager gm = new GuitarManager();
        GuitarInfo guitarInfo = new GuitarInfo(2148123);
        GuitarSpec guitarSpec1 = new GuitarSpec(1000,"첫번째 기타");
        Guitar guitar1 = new Guitar(guitarInfo,guitarSpec1);
        System.out.println(guitar1.getGuitarSpec().getPrice());
        gm.updatePrice(guitar1,5000);
        System.out.println(guitar1.getGuitarSpec().getPrice());
    }
}
