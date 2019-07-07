package core;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

public class DBHelperMongoDB {
    MongoCollection<Document> collection;

    public DBHelperMongoDB() {
        MongoClientURI uri = new MongoClientURI("mongodb://chaveen:1234@first-shard-00-00-nzkcy." +
                "mongodb.net:27017,first-shard-00-01-nzkcy.mongodb.net:27017,first-shard-00-02-nzkcy" +
                ".mongodb.net:27017/test?ssl=true&replicaSet=First-shard-0&authSource=admin&retryWrites=true");
        // Creating a Mongo client
        MongoClient mongo = new MongoClient(uri);


        // Accessing the database
        MongoDatabase database = mongo.getDatabase("Test");

        // Retrieving  collections
        collection = database.getCollection("items");

    }


    public void add(String bookID, String bookTitle, String bookPrice) {
        Document book = new Document()
                .append("Book ID", bookID)
                .append("Book Title", bookTitle)
                .append("Book Price", bookPrice);

        collection.insertOne(book);
    }

    public void delete(String bookID) {
        collection.deleteOne(Filters.eq("Book ID", bookID));
    }

    public void update(String bookID,String bookTitle,String bookPrice){
        Bson old = new Document("Book ID",bookID);
        Bson newData = new Document().append("Book Title",bookTitle).append("Book Price",bookPrice);
        Bson updateDoc = new Document("$set",newData);
        collection.updateOne(old,updateDoc);
    }
}
