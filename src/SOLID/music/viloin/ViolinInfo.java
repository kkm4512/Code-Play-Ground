package SOLID.music.viloin;

import SOLID.music.interfaces.Info;

public class ViolinInfo implements Info {
    private Integer serialNumber;

    public ViolinInfo(Integer serialNumber) {
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
