package SOLID.music.viloin;

import SOLID.music.interfaces.Info;
import SOLID.music.interfaces.MusicalInstrument;
import SOLID.music.interfaces.Spec;

public class Violin implements MusicalInstrument {
    private final Info info;
    private final Spec spec;

    public Violin(Info info, Spec spec) {
        this.info = info;
        this.spec = spec;
    }

    public Info getInfo() {
        return info;
    }

    public Spec getSpec() {
        return spec;
    }
}
