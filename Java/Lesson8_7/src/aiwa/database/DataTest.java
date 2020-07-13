package aiwa.database;

import aiwa.entity.Items;

import java.io.*;
import java.util.ArrayList;

public class DataTest {
    public static void main(String[] args) {
        try {
            BufferedReader printWriter = new BufferedReader(
                    new BufferedReader(
                            new FileReader("Data1.csv")
                    )
            );
            String line;
            ArrayList<Items> itemsArrayList = new ArrayList<>();
            while ((line=printWriter.readLine())!=null){
                System.out.println(line);
                String[] data = line.split(",");
                Items items = new Items();
                items.setId(Integer.parseInt(data[0]));
                items.setName(data[1]);
                items.setPrice(Integer.parseInt(data[2]));
                itemsArrayList.add(items);
            }
            printWriter.close();
            for (Items items : itemsArrayList) {
                System.out.println(items);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
