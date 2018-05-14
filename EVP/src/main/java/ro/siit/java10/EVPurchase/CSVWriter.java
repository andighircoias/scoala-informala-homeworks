package ro.siit.java10.EVPurchase;

import java.io.*;
import java.util.List;

public class CSVWriter {

    private String fileName;
    private BufferedWriter bw = null;
    private FileWriter fw = null;
    private final String HEADER = "Manufacturer, Model, Year, Price, HorsePower, Motor, Battery, Consumption, Type, FastCharging, RangeInKm, Stock";


    public CSVWriter(String fileName) {
        this.fileName = fileName;
    }

    public List<Car> writeCars(List<Car> carList) {
        List<Car> listCSV = carList;
        String format;
        try {
            File file = new File(fileName);
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            if (!file.exists()) {
                file.createNewFile();
            }
            bw.append(HEADER);
            for (Car c : carList) {
                format = c.CSVFormat();
                bw.newLine();
                bw.append(format);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return listCSV;
    }


}

