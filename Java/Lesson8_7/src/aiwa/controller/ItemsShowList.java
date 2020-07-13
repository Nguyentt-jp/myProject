package aiwa.controller;

import aiwa.entity.Items;
import aiwa.model.ItemsModel;
import aiwa.view.ItemsListViewHtml;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemsShowList {

    public void showList(ArrayList<Items> items) {
        for (Items item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keyword = scan.nextLine();
        ItemsModel itemsModel = new ItemsModel();
        ArrayList<Items> itemsArrayList1 = itemsModel.findByName(keyword);
        ItemsListViewHtml itemsListViewHtml = new ItemsListViewHtml();
        itemsListViewHtml.showList(itemsArrayList1);


    }
}
