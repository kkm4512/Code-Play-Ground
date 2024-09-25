package SOLID.viloin;

import SOLID.interfaces.Manager;
import SOLID.interfaces.MusicalInstrument;

public class ViolinManager implements Manager {

    private final MusicalInstrument musicalInstrument;

    public ViolinManager(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }
    public void updatePrice(Integer newPrice) {
        musicalInstrument.getSpec().setPrice(newPrice);
    }

    @Override
    public void play() {
        System.out.println("바이올린을 킵니다");
    }
}
