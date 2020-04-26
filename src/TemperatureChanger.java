import java.io.Serializable;

public abstract class TemperatureChanger implements Serializable {

    public int id;
    public String name;
    public String price;
    public String color;
    public String type;

    public TemperatureChanger(int id, String name, String price, String color, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

}