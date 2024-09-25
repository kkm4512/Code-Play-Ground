package SOLID;

import SOLID.music.guitar.Guitar;
import SOLID.music.guitar.GuitarInfo;
import SOLID.music.guitar.GuitarManager;
import SOLID.music.guitar.GuitarSpec;
import SOLID.music.interfaces.Info;
import SOLID.music.interfaces.Manager;
import SOLID.music.interfaces.MusicalInstrument;
import SOLID.music.interfaces.Spec;
import SOLID.music.viloin.Violin;
import SOLID.music.viloin.ViolinInfo;
import SOLID.music.viloin.ViolinManager;
import SOLID.music.viloin.ViolinSpec;

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
