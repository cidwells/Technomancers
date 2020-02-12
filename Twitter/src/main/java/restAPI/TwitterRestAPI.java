package restAPI;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class TwitterRestAPI {

    protected  final  static String API_KEY = "JHTokLVLV5JrBUafxq5CHR5Pl";
    protected  final  static String API_SECRET_KEY = "W6VGqQNtVmpDxd1udMBT4cneTVdtAPjtRJxqqk3MUvkh5Alpim";
    protected  final  static String ACCESS_TOKEN = "1225946326799699969-gMVkZ4m1Sl4sEyoT0JPVjEGqQufzAg";
    protected  final  static String ACCESS_TOKEN_SECRET= "Tw9Biqj5HqghHUHu2u045BJSfrpeMgT6lG8PCtCuQV7v8";
    protected  final  static String BASE_URI ="https://api.twitter.com/1.1";
    protected  final  static String TWEET_ENDPOINT = "/statuses/update.json";

    public ValidatableResponse sentTweet (String status){
        return given().auth().oauth(API_KEY, API_SECRET_KEY, ACCESS_TOKEN, ACCESS_TOKEN_SECRET)
                .param("status", status)
                .when().post(BASE_URI + TWEET_ENDPOINT)
                .then();
    }

}
