package SOLID;

public class GuitarManager {
    public void updatePrice(Guitar guitar, Integer newPrice) {
        guitar.getGuitarSpec().setPrice(newPrice);
    }
}
