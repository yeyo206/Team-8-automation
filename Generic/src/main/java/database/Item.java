package database;

public class Item {

    private String itemName ;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Item(){}

    public Item(String itemName ){
        this.itemName = itemName;
    }
}
