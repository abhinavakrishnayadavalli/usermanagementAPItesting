package com.qaautomation.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateUserTest {

    @Test
    public void testUpdateUser() {
        JSONObject req = new JSONObject();
        req.put("name", "Prem Updated");
        req.put("role", "QA Lead");

        Response res = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(req.toString())
                .when()
                .put("http://localhost:3000/users/1")
                .then()
                .extract().response();

        System.out.println(res.asPrettyString());
        Assert.assertEquals(res.statusCode(), 200);
    }
}
