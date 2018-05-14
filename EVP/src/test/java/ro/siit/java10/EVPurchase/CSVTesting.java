package ro.siit.java10.EVPurchase;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVTesting {
    @Test
    public void writeCSVFileTest() throws IOException {
        List<Car> list = new ArrayList<>();
        Car c6 = new Car("Smart", "ForFour", 2018, 22700, 86, 19,
                35, 15, "New", "No", 260, 7);

        list.add(c6);

        BufferedWriter bw = null;
        String myContent;
        File file = new File("fileTest.csv");
        FileWriter fw = new FileWriter(file);
        bw = new BufferedWriter(fw);
        if (!file.exists()) {
            file.createNewFile();
        }

        myContent = c6.getManufacturer() + ", " + c6.getModel();
        bw.write(myContent);
        bw.newLine();
        if (bw != null) {
            bw.flush();
            bw.close();
        }
        String expected = "Smart, ForFour";
        String actual = myContent;
        assertEquals(expected, actual);

    }


}


