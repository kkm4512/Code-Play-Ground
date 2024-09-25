package SOLID;

public class Guitar {
    private final GuitarInfo guitarInfo;
    private final GuitarSpec guitarSpec;

    public Guitar(GuitarInfo guitarInfo, GuitarSpec guitarSpec) {
        this.guitarInfo = guitarInfo;
        this.guitarSpec = guitarSpec;
    }

    public GuitarInfo getGuitarInfo() {
        return guitarInfo;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
