package aiwa.model;

import aiwa.database.ItemsTable;
import aiwa.entity.Items;

import java.util.ArrayList;

public class ItemsModel {
    private ArrayList<Items> itemsArrayListFind;
    private ArrayList<Items> itemsArrayListFinded;
    private Items items;
    private ItemsTable itemsTable = new ItemsTable();

    public ArrayList<Items> findByName(String keyword) {
        itemsArrayListFinded = new ArrayList<>();
        itemsArrayListFind = itemsTable.getData();
        for (int i = 0; i < itemsArrayListFind.size(); i++) {
            items = itemsArrayListFind.get(i);
            if (items.getName().contains(keyword)) {
                itemsArrayListFinded.add(items);
            }
        }
        return itemsArrayListFinded;
    }
    public ArrayList<Items> findById(int id) {
        itemsArrayListFinded = new ArrayList<>();
        itemsArrayListFind = itemsTable.getData();
        for (int i = 0; i < itemsArrayListFind.size(); i++) {
            items = itemsArrayListFind.get(i);
            if (items.getId()==id) {
                itemsArrayListFinded.add(items);
            }
        }
        return itemsArrayListFinded;
    }
    public ArrayList<Items> findByPrice(int min, int max) {
        itemsArrayListFinded = new ArrayList<>();
        itemsArrayListFind = itemsTable.getData();
        for (int i = 0; i < itemsArrayListFind.size(); i++) {
            items = itemsArrayListFind.get(i);
            if (items.getPrice()<=max&&items.getPrice()>=min) {
                itemsArrayListFinded.add(items);
            }
        }
        return itemsArrayListFinded;
    }
}
