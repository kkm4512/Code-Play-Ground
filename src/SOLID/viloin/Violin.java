package SOLID.viloin;

import SOLID.interfaces.Info;
import SOLID.interfaces.MusicalInstrument;
import SOLID.interfaces.Spec;

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
