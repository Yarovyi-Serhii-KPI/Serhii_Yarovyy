package http_requests;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.*;
import com.jayway.restassured.filter.log.*;
import static com.jayway.restassured.RestAssured.given;
import org.apache.commons.io.IOUtils;
import org.apache.http.conn.params.*;
import org.apache.http.client.*;
import org.apache.http.impl.client.*;
import org.json.simple.JSONObject;
import org.testng.annotations.*;
import file_creator.populator;


public class getter {
    populator MyPopulator;
    @Test
    public void getterTest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("path", "/CI-CD/dummy.txt");
        requestBody.put("include_media_info", "false");
        requestBody.put("include_deleted", "false");
        requestBody.put("include_has_explicit_shared_members", "false");
        MyPopulator.populateFile();
        given()
                .auth()
                .oauth2("CFAz5vO9LowAAAAAAAAAAR_3wRhLi1rdg8PJ5eOMoquLJEM5dUD1brfAkIQ_pZPz")
                .body(requestBody.toJSONString())
                .when()
                .post("https://api.dropboxapi.com/2/files/get_metadata")
                .then()
                .assertThat()
                .statusCode(200);
        MyPopulator.removeDummyFile();
    }

}
