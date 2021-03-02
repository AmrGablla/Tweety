package v1.post;

import org.bson.types.ObjectId;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

/**
 * Data returned from the database
 */ 


@Entity(value = "DB.tweets")
public class PostData {

    public PostData() {
    }

    public PostData(String user, String tweet) {
        this.user = user;
        this.tweet = tweet;
    }

    @Id 
    public ObjectId id;
    public String user;
    public String tweet;
}
