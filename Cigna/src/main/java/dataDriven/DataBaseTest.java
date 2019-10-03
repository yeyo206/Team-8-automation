
import com.mongodb.BasicDBObject;
import database.ConnectToMongoDB;
import database.Item;
import database.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseTest {

    static BasicDBObject object = new BasicDBObject();

    static void insertToMongo(String stName, String stID, String stDOB){
        ConnectToMongoDB.insertIntoToMongoDB(new User(stName, stID, stDOB), "students");
    }

    static void insertFromArrayList(List<String> list, String collectionName){
        ConnectToMongoDB c = new ConnectToMongoDB();
        c.insertIntoMongoDB(list, collectionName);
    }

    static void readDB(String key, String value){
        List<String> list= ConnectToMongoDB.getValuesAsList("students",
                           ConnectToMongoDB.query(key, value
        ));

        for (String s : list
             ) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        System.out.println(ConnectToMongoDB.getValuesAsListItem("items", object, "item"));
        try{
            insertFromArrayList(ExcelReader.getItems(), "items");
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
