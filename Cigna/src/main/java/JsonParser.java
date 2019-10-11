import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class JsonParser {

    static String baseUrl = "http://info.venturepulse.org:8080/service-webapp";

    public static List<Employee> empObject(){
        Response response = given().when().get(baseUrl+"/api/AllEmployeeResources").then().statusCode(200).extract().response();
        return Arrays.asList(response.getBody().as(Employee[].class));
    }

    public static String getEmployee(String employeeName){
        StringBuilder builder;
        for (Employee employee : empObject()
        ) {
            if(employee.getEmpName().equalsIgnoreCase(employeeName)){
                builder = new StringBuilder();
                builder.append(employee.getEmpName())
                        .append(employee.getDepartment());
                return builder.toString();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        for (Employee employee : empObject()
             ) {
            System.out.println("{" + employee.getEmpName()+" "+
                    employee.getEmpEmail()+" "+
                    employee.getSalary()+" "+
                    employee.getDepartment()+ "}"
            );
        }
        System.out.println(empObject().size());
    }

}
