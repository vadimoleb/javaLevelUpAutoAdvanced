package ru.levelp.at.advance.lesson0203.taf.api.client;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.RequiredArgsConstructor;

import java.util.Map;

import static io.restassured.RestAssured.given;

@RequiredArgsConstructor(staticName = "of")
public class BoardsApiClient {

    private static final String BOARDS_ENDPOINT = "/boards";

    private final RequestSpecification requestSpecification;

    public Response createBoard(final String name) {
        return given()
                .spec(requestSpecification)
                .queryParams(Map.of("name", name))
                .when()
                .post(BOARDS_ENDPOINT)
                .andReturn();
    }
}
