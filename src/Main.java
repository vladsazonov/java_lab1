import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<TemperatureChanger> temperatureChanger = new ArrayList<TemperatureChanger>();
        temperatureChanger.add(new Heater(1, "Samsung AR9500T", "8600", "white", "conditioner", 6, 3, "500-1000 Вт"));
        temperatureChanger.add(new AirConditioner(2, "Bork R704", "4500", "grey", "heater", "R410A", 5, "10.9"));

        FileWriter csvWrite = new FileWriter("data.csv");
        csvWrite.append(temperatureChanger.toString());
        csvWrite.close();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("new.dat"))) {
            oos.writeObject(temperatureChanger);
            System.out.println("File has been written");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList<TemperatureChanger> newTemperatureChanger = new ArrayList<TemperatureChanger>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("new.dat"))) {
            newTemperatureChanger = ((ArrayList<TemperatureChanger>) ois.readObject());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (TemperatureChanger item : newTemperatureChanger) {
            System.out.println(item.getClass());
            System.out.println(item.toString());
        }
    }
}






