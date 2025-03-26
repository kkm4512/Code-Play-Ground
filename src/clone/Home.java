package clone;

public class Home implements Cloneable {
    private String name;

    public Home(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
