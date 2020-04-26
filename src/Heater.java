class Heater extends TemperatureChanger {
    public int heatedArea;
    public int modesNumber;
    public String power;

    public Heater(int id, String name, String price, String color, String type, int heatedArea, int modesNumber, String power) {
        super(id, name, price, color, type);

        this.heatedArea = heatedArea;
        this.modesNumber = modesNumber;
        this.power = power;
    }

    @Override
    public String toString() {

        return "\nId: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Color:" + getColor() + "\n" +
                "Type: " + getType() + "\n" +
                "HeatedArea: " + getHeatedArea() + "\n" +
                "ModesNumber: " + getModesNumber() + "\n" +
                "Power: " + getPower() + "\n";
    }

    public int getHeatedArea() {
        return heatedArea;
    }

    public int getModesNumber() {
        return modesNumber;
    }

    public String getPower() {
        return power;
    }
}
