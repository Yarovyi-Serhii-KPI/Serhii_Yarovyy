package http_requests;


import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.*;
import file_creator.populator;

public class deleter {

    @Test
    public void deleterTest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("path", "/CI-CD/dummy.txt");
        given()
                .auth()
                .oauth2("CFAz5vO9LowAAAAAAAAAAR_3wRhLi1rdg8PJ5eOMoquLJEM5dUD1brfAkIQ_pZPz")
                .body(requestBody.toJSONString())
                .when()
                .post("https://content.dropboxapi.com/2/files/upload")
                .then()
                .assertThat()
                .body("name", equalTo("/CI-CD/dummy.txt"));
    }

}
