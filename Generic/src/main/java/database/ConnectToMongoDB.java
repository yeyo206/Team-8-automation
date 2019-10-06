package database;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.*;

public class ConnectToMongoDB {

    public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase connectToMongoDB() {
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("local");
        System.out.println("Database Connected");

        return mongoDatabase;
    }

    public static String insertIntoToMongoDB(User user, String collectionName){
        String profile = user.getStName();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
        Document document = new Document().append("stName",user.getStName()).append("stID", user.getStID()).
                append("stDOB",user.getStDOB());
        collection.insertOne(document);
        return profile + " has been registered";
    }

    public static String insertIntoToMongoDB(Item item, String collectionName){
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
        Document document = new Document().append("itemName", item.getItemName());
        collection.insertOne(document);
        return "new item: " + item.getItemName() + " has been inserted.";
    }

    public static List<String> getValuesAsList(String collectionName, BasicDBObject object){
        List<String> list = new ArrayList<>();
        MongoCollection<Document> collection = connectToMongoDB().getCollection(collectionName);
        FindIterable<Document> iterable = collection.find(object);
        for (Document doc : iterable
             ) {
            list.add(doc.getString("stName"));
            list.add(doc.getString("stID"));
            list.add(doc.getString("stDOB"));
        }
        return list;
    }

    public static List<String> getValuesAsListItem(String collectionName, BasicDBObject object, String key){
        List<String> list = new ArrayList<>();
        MongoCollection<Document> collection = connectToMongoDB().getCollection(collectionName);
        FindIterable<Document> iterable = collection.find(object);
        for (Document doc : iterable
             ) {
            list.add(doc.getString(key));
        }
        return list;
    }

    public static BasicDBObject query(String keyToUse, String valueToUse){
        BasicDBObject object = new BasicDBObject();
        object.put(keyToUse, valueToUse);
        return object;
    }

    public static String insertIntoMongoDB(List<String> items, String collectionName){
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection myCollection = mongoDatabase.getCollection(collectionName);
        boolean collectionExists = mongoDatabase.listCollectionNames()
                .into(new ArrayList<String>()).contains(collectionName);
        if(collectionExists) {
            myCollection.drop();
        }
        for(int i=0; i<items.size() - 1; i++){
            MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
            Document document = new Document().append("item", items.get(i));
            collection.insertOne(document);
        }
        return  "Student has been registered";
    }

    public static List<User> readUserProfileFromMongoDB(String collectionName){
        List<User> list = new ArrayList<User>();
        User user = new User();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for(Document doc : iterable){
            String stName = (String)doc.get("stName");
            user.setStName(stName);
            String stID = (String)doc.get("stID");
            user.setStID(stID);
            String stDOB = (String)doc.get("stDOB");
            user.setStID(stDOB);
            user = new User(stName,stID,stDOB);
            list.add(user);
        }
        return list;
    }

    public List<Student> readStudentListFromMongoDB(String profileName){
        List<Student> list = new ArrayList<Student>();
        Student student = new Student();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for(Document doc : iterable){
            String firstName = (String)doc.get("firstName");
            student.setFirstName(firstName);
            String lastName = (String)doc.get("lastName");
            student.setLastName(lastName);
            String score = (String)doc.get("score");
            student.setScore(score);
            String id = (String) doc.get("id");
            student.setId(id);
            student = new Student(student.getFirstName(),student.getLastName(),student.getScore(),student.getId());
            list.add(student);
        }
        return list;
    }

    public static void main(String[] args){
        insertIntoToMongoDB(new User("Naomi Chan", "4493","07-1996"), "profile");
        List<User> user = readUserProfileFromMongoDB("students");
        for(User person : user){
            System.out.println(person.getStName()+ " "+ person.getStID());
        }
    }
}
