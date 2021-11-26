import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

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

        //Retona os valores
        Document home2 = homework02.find().first();
        System.out.println(home2);

        client.close();
    }

}
