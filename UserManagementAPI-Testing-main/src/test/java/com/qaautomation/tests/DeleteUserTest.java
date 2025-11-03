package com.qaautomation.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUserTest {

    @Test
    public void testDeleteUser() {
        Response res = RestAssured
                .given()
                .when()
                .delete("http://localhost:3000/users/1")
                .then()
                .extract().response();

        Assert.assertEquals(res.statusCode(), 200);
    }
}
