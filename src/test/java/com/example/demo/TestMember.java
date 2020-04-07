package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;



public class TestMember
{
    //@Before()
////    public void setUP(){
////
////        RestAssured.baseURI = "http://localhost";
////        RestAssured.port = 8080;
////    }
//    @Before
//    public void setUp() {
//        RestAssured.baseURI= "http://localhost";
//        RestAssured.port = 8080;
//        RestAssured.basePath = "/api";
//    }

    @Test
    public void testGETMember()
    {
       // RestAssured.get("http://localhost:8080/api/members").then().body("mid", equalTo("1"));
    }
    @Test
    public void testStatusCode() {
        RestAssured.get("http://localhost:8080/api/members").
                then().
                statusCode(200).log().all();
    }

//    @Test //get帶參數
//    public void testRequestWithParameters() {
//        Map<String, String> parameters = new HashMap<String,String>();
//        parameters.put("userId", "2");
//        parameters.put("id", "14");
//        RestAssured.given().
//                params(parameters).
//                when().
//                get("").
//                then().
//                statusCode(200).log().all();
//    }

}
