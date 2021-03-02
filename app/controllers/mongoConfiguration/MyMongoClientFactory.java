package controllers.mongoConfiguration;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.typesafe.config.Config;
import it.unifi.cerm.playmorphia.MongoClientFactory;

import java.util.Arrays;

public class MyMongoClientFactory extends MongoClientFactory {

    private Config config;

    public MyMongoClientFactory(Config config) {
        super(config);
        this.config = config;
    }

    public MongoClient createClient() throws Exception {
        return new MongoClient(Arrays.asList(new
        ServerAddress("mongodb+srv://tweetyUser:P@$$w0rd@cluster0.ogpl4.mongodb.net/tweety?retryWrites=true&w=majority")));
    }

    public String getDBName() {
        return config.getString("playmorphia.database");
    }

}