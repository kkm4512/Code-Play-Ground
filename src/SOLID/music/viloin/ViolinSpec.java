package SOLID.music.viloin;

import SOLID.music.interfaces.Spec;

public class ViolinSpec implements Spec {
    private Integer price;
    private String model;

    public ViolinSpec(Integer price, String model) {
        this.price = price;
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
