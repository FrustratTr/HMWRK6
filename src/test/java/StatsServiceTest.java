package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.calculateTotalSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageMonthlySales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.calculateAverageMonthlySales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.findMonthWithMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.findMonthWithMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.calculateMonthsBelowAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5; // ожидается 5 месяцев, где продажи выше среднего
        int actual = service.calculateMonthsAboveAverageSales(sales);

        assertEquals(expected, actual);
    }
}