package REST;

import io.restassured.response.Response;
import junit.framework.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SingleEmp {


        @Test
        public void callSingleEmployeeResources() {
            Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/590a4acd35522970c7956cdf").then().statusCode(200).extract().response();
            String statusLine = response.getStatusLine();
            int statusCode = response.getStatusCode();
            String body = response.getBody().prettyPrint();
            Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
            Assert.assertEquals(statusCode, 200);
        }


    }

