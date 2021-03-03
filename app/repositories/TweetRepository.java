package repositories;

import it.unifi.cerm.playmorphia.PlayMorphia;
import v1.post.PostData;

import org.bson.types.ObjectId;

import java.util.List;

import javax.inject.Inject;

public class TweetRepository {

    private final PlayMorphia morphia;

    @Inject
    public TweetRepository(PlayMorphia morphia) {
        this.morphia = morphia;
    }

    public PostData findById(String id) {
        PostData user = morphia.datastore().createQuery(PostData.class).field("_id").equal(new ObjectId(id)).first();
        return user;
    }

    public List<PostData> getDatabase() {
        var d = morphia.datastore().createQuery(PostData.class).search("amr").find().toList();
        return d;
    }

    public void save(PostData u) {
        morphia.datastore().save(u);
    }
}