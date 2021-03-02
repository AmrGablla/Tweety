package controllers;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;
import play.mvc.*;
import repositories.TweetRepository;
import v1.post.PostData;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class HomeController extends Controller {

    @Inject
    private TweetRepository user;

    public Result index(String id) {
        PostData u = user.findById(id);
        JsonNode jsonObject = Json.toJson(u);
        return created(Util.createResponse(jsonObject, true));
    }

    public Result save(PostData _user) {
        user.save(_user);
        return ok();
    }

    public Result list() {  
        var data = user.getDatabase();
        JsonNode jsonObject = Json.toJson(data);
        return ok(Util.createResponse(jsonObject, true));
    }
}
