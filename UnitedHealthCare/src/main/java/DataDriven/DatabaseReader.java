package DataDriven;

import database.ConnectToMongoDB;

import java.util.ArrayList;
import java.util.List;

public class DatabaseReader {
    static List<String> list;

    public static void main(String[] args) {
        System.out.println(ConnectToMongoDB.insertIntoMongoDB(itemsList(), "test"));
    }

    public static List<String> itemsList(){
        list = new ArrayList<>();
        list.add("home insurance");
        list.add("auto insurance");
        list.add("business insurance");
        list.add("travel insurance");
        list.add("agents in miami");
        return list;
    }
}
