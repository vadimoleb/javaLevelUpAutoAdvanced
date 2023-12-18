package ru.levelpp.at.advance.lesson0203.taf.trello.test;

import com.github.javafaker.Faker;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

public class BoardsTest {
    Faker FAKER = new Faker();

    @Test
    void testCreate(){
        //сгенерировать название
        Allure.step("Создаем имя новой доски",() -> FAKER.funnyName());
    }
}
