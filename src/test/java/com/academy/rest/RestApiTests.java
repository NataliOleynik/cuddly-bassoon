package com.academy.rest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class RestApiTests {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://localhost/rest/json";
        port = 8081;
    }

//    @Test
//    public void testGetSubscriber() {
//        Response response = given()
//                .get("/subscribers/1");
//
//        assertThat(response.getStatusCode(), equalTo(200));
//
//        response.getBody().print();
//
//    }

    @Test
    public void testGetSubscriber() {
        Response response = given()
                .get("/subscribers/1");

        assertThat(response.getStatusCode(), equalTo(200));

        response.getBody().print();
        JsonPath jsonPath = response.getBody().jsonPath();
        int id = jsonPath.getInt("id");
        String firstName = jsonPath.getString("firstName");

        assertThat(id, equalTo(1));
        assertThat(firstName, equalTo("Peter"));
    }

    @Test
    public void testElegantGetSubscriber() {
        given()
                .when()
                .get("/subscribers/1")
                .then()
                .assertThat()
                .body("id", equalTo(1))
                .and()
                .body("firstName", equalTo("Peter"))
                .and()
                .statusCode(200);
    }

    @Test
    public void testElegantGetAllSubscriber() {
        given()
                .when()
                .get("/subscribers")
                .then()
                .assertThat()
                .body("size()", greaterThanOrEqualTo(1))
                .and()
                .body("[0].id", equalTo(1))
                .and()
                .body("[0].firstName", equalTo("Peter"))
                .and()
                .statusCode(200);
    }

    @Test
    public void testCreateSubscriber() {
        JSONObject json = new JSONObject();
        json.put("firstName", "Ashot2"); // Cast
        json.put("lastName", "Ivanov");
        json.put("age", 68);
        json.put("gender", "f");

        given()
                .header("Content-Type", "application/json")
                .body(json.toJSONString())
                .post("/subscribers")
                .then()
                .assertThat()
                .header("Location", containsString("http://localhost:8081/rest/json/subscribers"))
                .statusCode(201);
    }

    @Test
    public void testNonElegantCreateSubscriber() {
        JSONObject json = new JSONObject();
        json.put("firstName", "Ashot2"); // Cast
        json.put("lastName", "Ivanov");
        json.put("age", 68);
        json.put("gender", "f");

        RequestSpecification spec = given();
        spec.header("Content-Type", "application/json");
        spec.body(json.toJSONString());
        Response response = spec.post("/subscribers");

        String location = response.getHeader("Location");
        int statusCode = response.statusCode();
        Assert.assertTrue(location.contains("http://localhost:8081/rest/json/subscribers"));
        Assert.assertEquals(statusCode, 201);
    }

    @Test
    public void testUpdateSubscriber() {
        JSONObject json = new JSONObject();
        json.put("id", 6768); // Cast
        json.put("firstName", "Ashot2"); // Cast
        json.put("lastName", "Ivanov");
        json.put("age", 58);
        json.put("gender", "f");
        given()
                .header("Content-Type", "application/json")
                .body(json.toJSONString())
                .put("/subscribers/6768")
                .then()
                .assertThat()
                .statusCode(200);

        given().get("/subscribers/6768")
                .then()
                .assertThat()
                .body("id", equalTo(6768))
                .and()
                .body("age", equalTo(58));

    }
}
