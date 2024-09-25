package SOLID.guitar;

import SOLID.interfaces.Info;
import SOLID.interfaces.MusicalInstrument;
import SOLID.interfaces.Spec;

public class Guitar implements MusicalInstrument {
    private final Info info;
    private final Spec spec;

    public Guitar(Info info, Spec spec) {
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
