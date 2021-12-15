package http_requests;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.*;
import com.jayway.restassured.filter.log.*;
import org.json.simple.*;
import static com.jayway.restassured.RestAssured.given;
import org.apache.http.impl.client.*;
import org.testng.annotations.*;
import file_creator.populator;
import java.io.File;
import java.util.Scanner;



public class setter {
    populator MyPopulator;

    @Test
    public void setterTest() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("path", "/CI-CD/dummy.txt");
        requestParams.put("mode", "add");
        requestParams.put("autorename", "true");
        requestParams.put("mute", "false");
        requestParams.put("strict_conflict", "false");
        MyPopulator.populateFile();
        given()
                .auth()
                .oauth2("CFAz5vO9LowAAAAAAAAAAR_3wRhLi1rdg8PJ5eOMoquLJEM5dUD1brfAkIQ_pZPz")
                .param("Dropbox-API-Arg",requestParams.toJSONString())
                .body("dummy.txt")
                .when()
                .post("https://content.dropboxapi.com/2/files/upload")
                .then()
                .assertThat()
                .statusCode(200);
        MyPopulator.removeDummyFile();
    }

}
