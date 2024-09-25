package SOLID.guitar;

import SOLID.interfaces.Info;

public class GuitarInfo implements Info {
    private Integer serialNumber;

    public GuitarInfo(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
}
