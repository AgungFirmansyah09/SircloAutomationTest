package Financial.service;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class ApiService {
    private static final String API_BASEURL = "http://qa-interview.srcli.xyz";

    public void GETHomePage (){
        Response response = SerenityRest.given()
                .get(API_BASEURL + "/");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void UserAlreadyLogin (){
        JSONObject bodyJson =  new JSONObject();

        bodyJson.put("Username","root");
        bodyJson.put("Password","root123");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void UserInvalidUsernameAndPassword (){
        JSONObject bodyJson =  new JSONObject();

        bodyJson.put("Username","roooot");
        bodyJson.put("Password","root123455");

        Response response = SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }

    public void UserLogout (){
        Response response = SerenityRest.given()
                .delete(API_BASEURL + "/");
        System.out.println(response.getBody());
        System.out.println(response.prettyPrint());
    }


}
