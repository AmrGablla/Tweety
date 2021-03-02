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
    private TweetRepository tweetRepository;

    public Result index() {
        var data = tweetRepository.getDatabase();
        JsonNode jsonObject = Json.toJson(data);
        return ok(Util.createResponse(jsonObject, true));
    }

    public Result save(Http.Request request) {
        JsonNode json = request.body().asJson();
        tweetRepository.save(Json.fromJson(json, PostData.class));
        return ok();
    } 
}
