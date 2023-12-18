package ru.levelp.at.advance.lesson0203.taf.trello.test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import ru.levelp.at.advance.lesson0203.taf.api.client.BoardsApiClient;
import ru.levelp.at.advance.lesson0203.taf.config.RequestSpecificationConfig;

import static io.qameta.allure.Allure.step;

class BoardsTest {

    private static final Faker FAKER = new Faker();

    @Test
    void testCreate() {
        // сгенернировать название доски
        final var boardName = step("Создаем имя новвой доски", () -> FAKER.funnyName().name());
        // final String boardName = step("Создаем имя новвой доски", () -> FAKER.funnyName().name());

        // создать доску
        final var response = step("Отправляем запрос", () ->
                BoardsApiClient.of(RequestSpecificationConfig.defaultSpecification()).createBoard(boardName))
                .then()
                .log().all()
                .statusCode(200);

        // проверить что доска создалась
    }
}

