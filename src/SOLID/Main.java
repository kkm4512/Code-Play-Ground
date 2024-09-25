package SOLID;

import SOLID.guitar.Guitar;
import SOLID.guitar.GuitarInfo;
import SOLID.guitar.GuitarManager;
import SOLID.guitar.GuitarSpec;
import SOLID.interfaces.Info;
import SOLID.interfaces.Manager;
import SOLID.interfaces.MusicalInstrument;
import SOLID.interfaces.Spec;
import SOLID.viloin.Violin;
import SOLID.viloin.ViolinInfo;
import SOLID.viloin.ViolinManager;
import SOLID.viloin.ViolinSpec;

public class Main {

    public static void main(String[] args) {
        // guitar
        Info guitarInfo = new GuitarInfo(12426);
        Spec guitarSpec = new GuitarSpec(1000,"어쿠스틱 기타");
        MusicalInstrument guitar = new Guitar(guitarInfo,guitarSpec);
        Manager guitarManager = new GuitarManager(guitar);
        guitarManager.play();
        guitarManager.updatePrice(10000);
        System.out.println(guitar.getSpec().getPrice());

        Info violinInfo = new ViolinInfo(771512);
        Spec violinSpec = new ViolinSpec(715000,"100년산 바이올린");
        MusicalInstrument violin = new Violin(violinInfo,violinSpec);
        Manager violinManager = new ViolinManager(violin);
        violinManager.play();
        violinManager.updatePrice(7000000);
        System.out.println(violin.getSpec().getPrice());
    }
}
