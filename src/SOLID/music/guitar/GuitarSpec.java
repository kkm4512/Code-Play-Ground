package SOLID.music.guitar;

import SOLID.music.interfaces.Spec;

public class GuitarSpec implements Spec {
    private Integer price;
    private String model;

    public GuitarSpec(Integer price, String model) {
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
