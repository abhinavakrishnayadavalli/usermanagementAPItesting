package com.qaautomation.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostUserTest {

    @Test
    public void testCreateUser() {
        JSONObject req = new JSONObject();
        req.put("name", "Prem");
        req.put("role", "QA Engineer");

        Response res = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(req.toString())
                .when()
                .post("http://localhost:3000/users")
                .then()
                .extract().response();

        System.out.println(res.asPrettyString());
        Assert.assertEquals(res.statusCode(), 201, "Status code check");
    }
}
