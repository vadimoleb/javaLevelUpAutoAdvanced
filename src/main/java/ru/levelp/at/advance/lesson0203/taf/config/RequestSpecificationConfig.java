package ru.levelp.at.advance.lesson0203.taf.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RequestSpecificationConfig {

    @SneakyThrows
    public static RequestSpecification defaultSpecification() {
        final var configFilePath = System.getenv("CONFIG_PATH");

        if (configFilePath == null) {
            throw new IllegalArgumentException("");
        }

        var apiConfiguration = new ObjectMapper().readValue(new File(configFilePath), ApiConfiguration.class);

        return new RequestSpecBuilder()
                .setBaseUri(apiConfiguration.url())
                .setBasePath(apiConfiguration.basePath())
                .setContentType(ContentType.JSON)
                .addQueryParams(Map.of(
                        "key", apiConfiguration.key(),
                        "token", apiConfiguration.token()
                ))
                .log(LogDetail.ALL)
                .build();
    }
}
