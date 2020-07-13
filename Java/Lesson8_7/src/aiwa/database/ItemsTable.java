package aiwa.database;

import aiwa.entity.Items;

import java.util.ArrayList;

public class ItemsTable {
    private Items items;
    private Items items1;
    private Items items2;
    private Items items3;
    private Items items4;
    private Items items5;
    private ArrayList<Items> itemsArrayListTable;

    public ArrayList<Items> getData(){
        items = new Items(1,"Doraemon","https://www.tv-asahi.co.jp/doraemon/cast/img/doraemon.jpg",1000);
        items1 = new Items(2,"Dragon Ball","https://www.tv-asahi.co.jp/doraemon/cast/img/doraemon.jpg",5000);
        items2 = new Items(3,"Inuyasha","https://www.tv-asahi.co.jp/doraemon/cast/img/doraemon.jpg",500);
        items3 = new Items(4,"Doraemon","https://www.tv-asahi.co.jp/doraemon/cast/img/doraemon.jpg",1000);
        items4 = new Items(5,"Dragon Ball","https://www.tv-asahi.co.jp/doraemon/cast/img/doraemon.jpg",300);
        items5 = new Items(6,"Inuyasha","https://www.tv-asahi.co.jp/doraemon/cast/img/doraemon.jpg",1000);

        itemsArrayListTable = new ArrayList<>();
        itemsArrayListTable.add(items);
        itemsArrayListTable.add(items1);
        itemsArrayListTable.add(items2);
        itemsArrayListTable.add(items3);
        itemsArrayListTable.add(items4);
        itemsArrayListTable.add(items5);

        return  itemsArrayListTable;
    }
}
