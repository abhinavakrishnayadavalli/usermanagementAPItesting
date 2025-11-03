package com.qaautomation.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUsersTest {

    @Test
    public void testGetAllUsers() {
        Response res = RestAssured
                .given()
                .when()
                .get("http://localhost:3000/users")
                .then()
                .extract().response();

        System.out.println("Response: " + res.asPrettyString());
        Assert.assertEquals(res.statusCode(), 200, "Status code check");
    }
}
