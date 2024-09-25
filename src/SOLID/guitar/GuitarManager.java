package SOLID.guitar;

import SOLID.interfaces.Manager;
import SOLID.interfaces.MusicalInstrument;

public class GuitarManager implements Manager {
    private final MusicalInstrument musicalInstrument;

    public GuitarManager(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    public void updatePrice(Integer newPrice) {
        musicalInstrument.getSpec().setPrice(newPrice);
    }

    @Override
    public void play() {
        System.out.println("기타를 칩니다");
    }
}
