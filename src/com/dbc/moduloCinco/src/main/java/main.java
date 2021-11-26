
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Arrays;


public class main {
    public static void main(String[] args) {


        MongoCredential credential = MongoCredential.createCredential("root", "admin", "root".toCharArray());
        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));

        MongoDatabase db = client.getDatabase("vemserdbc");
        MongoCollection<Document> homework02 = db.getCollection("homework02");
        Long id = homework02.countDocuments() + 1;


        Document novoProduto = new Document("_id", id)
                .append("valorUnitario", 1)
                .append("Descricao", "Água Mineral")
                .append("tipoProduto", "BEBIDA");

        homework02.insertOne(novoProduto);


        Bson updates = Updates.combine(
                Updates.set("valorUnitario", 1),
                Updates.set("Descricao", "Guarana"),
                Updates.set("tipoProduto", "BEBIDA"));

        UpdateOptions options = new UpdateOptions().upsert(true);
        UpdateResult result2 = homework02.updateOne(novoProduto, updates, options);

        // deleteOne
        homework02.deleteOne(Filters.eq("_id", 14));
      
        //Retona os valores
        Document home2 = homework02.find().first();
        System.out.println(home2);

        client.close();
    }


}
