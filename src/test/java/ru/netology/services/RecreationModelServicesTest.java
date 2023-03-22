package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RecreationModelServicesTest {
    @Test
    void numberMonthsNextYearFirstOption() {
        RecreationModelServices service = new RecreationModelServices();

        // подготавливаем данные:
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculation(10_000, 3_000, 20_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void numberMonthsNextYearSecondOption() {
        RecreationModelServices service = new RecreationModelServices();

        // подготавливаем данные:
        long expected = 2;

        // вызываем целевой метод:
        long actual = service.calculation(100_000, 60_000, 150_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}