package com.united.automation.apitests;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.sql.Array;
import java.util.*;

public class GetWeatherDetailsByCity {

    @Test
    public void testWeatherDetailsByCityName() {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get();
        String responseBody = response.getBody().asString();
        System.out.println("Response body is " + responseBody);
    }

    @Test
    public void testGetWeatherDataByCityNmae() {
        String responseBody = RestAssured.given().when()
                .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").asString();
        System.out.println("Response body is " + responseBody);

    }

    @Test
    public void testArray() {
        Integer[] it = new Integer[4];
        it[0] = 1;
        it[1] = 2;
        it[2] = 1;
        it[3] = 1;
        for (int i : it) System.out.println(i);

    }

    @Test
    public void testList() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 2);
        list.add(1, 2);
        list.add(2, 2);
        for (int i : list) System.out.println(i);


    }
    @Test
    public void testMap() {
        ArrayList<String> list=new ArrayList<String>();
        LinkedList<String> ll = new LinkedList<>();

        }
}
