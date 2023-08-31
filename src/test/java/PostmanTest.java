import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static  org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void ReturnData(){
        given()
                .baseUri("https://postman-echo.com")
                .body("HomeWork")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hhhh"));

    }

}
