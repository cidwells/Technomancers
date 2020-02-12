package testRestAPI;

import base.CommonAPI;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import restAPI.TwitterRestAPI;

import java.util.UUID;

public class TestRestAPI  {
    protected TwitterRestAPI restAPI;

    @BeforeClass
    public void setUp() {
        this.restAPI = new TwitterRestAPI();
    }
    @Test
    public void testUserCanTweetSuccessfully() {
        String status = "my first tweet from restAPI";
        ValidatableResponse response = this.restAPI.sentTweet(status);
        response.statusCode(200);
    }
    @Test
    public void testUserCannotPostDublicateTweet() {
        String status = "double tweet but should only show ones " + UUID.randomUUID();
        ValidatableResponse response = this.restAPI.sentTweet(status);
        response.statusCode(200);
        response = this.restAPI.sentTweet(status);
        response.statusCode(403);
    }
}
