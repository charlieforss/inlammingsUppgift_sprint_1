import javax.swing.*;

public abstract class Plant implements Waterreq {
    protected String name;
    protected double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }
}

