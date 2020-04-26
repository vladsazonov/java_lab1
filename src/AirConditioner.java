public class AirConditioner extends TemperatureChanger {
    private String refrigerantType;
    private int pipelineHeight;
    private String airflowRate;

    public AirConditioner(int id, String name, String price, String color, String type, String refrigerantType, int pipelineHeight, String airflowRate) {
        super(id, name, price, color, type);

        this.refrigerantType = refrigerantType;
        this.pipelineHeight = pipelineHeight;
        this.airflowRate = airflowRate;
    }

    @Override
    public String toString() {

        return "\nId: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Color: " + getColor() + "\n" +
                "Type: " + getType() + "\n" +
                "Refrigerant type: " + getRefrigerantType() + "\n" +
                "Pipeline height: " + getPipelineHeight() + "\n" +
                "Airflow rate: " + getAirflowRate() + "\n";
    }

    public String getRefrigerantType() {
        return refrigerantType;
    }

    public int getPipelineHeight() {
        return pipelineHeight;
    }

    public String getAirflowRate() {
        return airflowRate;
    }
}
