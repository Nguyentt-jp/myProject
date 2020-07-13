package aiwa.view;

import aiwa.controller.ItemsShowList;
import aiwa.database.ItemsTable;
import aiwa.entity.Items;
import aiwa.model.ItemsModel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemsView {

    private static ArrayList<Items> itemsArray;
    private static ArrayList<Items> itemsArrayFind;
    private static ItemsTable itemsTable;
    private static ItemsModel itemsModel;
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanStr = new Scanner(System.in);
    private static ItemsShowList itemsShowList;
    private static Items items;

    public static void main(String[] args) throws IOException {
        itemsTable = new ItemsTable();
        itemsArray = itemsTable.getData();
        itemsModel = new ItemsModel();
        itemsShowList = new ItemsShowList();


        try {
            PrintWriter printWriter = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("output/test.html")
                    )
            );
//           while (true) {
//               System.out.println("---------------学生の管理-----------------");
//               System.out.println("1: Itemsの目録を表示する！");
////            System.out.println("2: 学生の目録を加える");
////            System.out.println("3: 学生の目録を消す");
//               System.out.println("2: Itemsの目録を検査する");
//               System.out.println("3: exit!");
//
//               int n = scanInt.nextInt();
//               if (n == 1) {
//                   itemsShowList.showList(itemsArray);
//                   printWriter.close();
//               }  else if (n == 2) {
//                   while (true) {
//                       System.out.println("1: IDの検査");
//                       System.out.println("2: 名前の検査");
//                       System.out.println("3: 値段の検査");
//                       System.out.println("4: Exit!");
//                       int m = scanInt.nextInt();
//                       if (m == 1) {
//                           System.out.println("IDを入力して");
//                           int iD = scanInt.nextInt();
//                           itemsArrayFind = itemsModel.findById(iD);
//                           itemsShowList.showList(itemsArrayFind);
//                       } else if (m == 2) {
//                           System.out.println("キーワードを入力して");
//                           String key = scanStr.nextLine();
//                           itemsArrayFind = itemsModel.findByName(key);
//                           itemsShowList.showList(itemsArrayFind);
//                       } else if (m == 3) {
//                           System.out.println("キーワードを入力して");
//                           int min = scanInt.nextInt();
//                           int max = scanInt.nextInt();
//                           itemsArrayFind = itemsModel.findByPrice(min,max);
//                           itemsShowList.showList(itemsArrayFind);
//                       } else if (m==4) break;
//                   }
//               } else if (n == 3) {
//                   break;
//               }
//           }
//           printWriter.println("<ul>");
//           for (int i=0;i<itemsArray.size();i++){
//               items = itemsArray.get(i);
//               printWriter.println("<li>"+items.getName()+"</li>");
//           }
//           printWriter.println("<ul>");
            printWriter.println("<table border=1>");
            for (int i = 0; i < itemsArray.size(); i++) {
                items = itemsArray.get(i);
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
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
