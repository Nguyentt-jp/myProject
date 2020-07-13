package aiwa.view;

import aiwa.controller.ItemsShowList;
import aiwa.database.ItemsTable;
import aiwa.entity.Items;
import aiwa.model.ItemsModel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemsListViewHtml {

    private static ArrayList<Items> itemsArray;
    private static ArrayList<Items> itemsArrayFind;
    private static ItemsTable itemsTable;
    private static ItemsModel itemsModel;
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanStr = new Scanner(System.in);
    private static ItemsShowList itemsShowList;
    private static Items items;

    public void showList(ArrayList<Items> itemsArray1) {
        itemsTable = new ItemsTable();
        itemsArray = itemsTable.getData();
        itemsModel = new ItemsModel();
        itemsShowList = new ItemsShowList();
        try{
            PrintWriter printWriter = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("output/test.html")));
            printWriter.println("<table border=1>");
            for (int i = 0; i < itemsArray1.size(); i++) {
                items = itemsArray1.get(i);
                printWriter.println("\t<tr>");
                printWriter.print("\t\t<th>");
                printWriter.print(items.getId());
                printWriter.println("</th>");
                printWriter.print("\t\t<td>");
                printWriter.print(items.getName());
                printWriter.println("</td>");
                printWriter.print("\t\t<td>");
                printWriter.print(items.getPrice());
                printWriter.println("</td>");
                printWriter.print("\t\t<td>");
                printWriter.print("<img src=\""+items.getImage()+"\"width=\"150\" height=\"150\" >");
                printWriter.println("</td>");

                printWriter.println("\t</tr>");
            }
            printWriter.println("</table>");
            printWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
