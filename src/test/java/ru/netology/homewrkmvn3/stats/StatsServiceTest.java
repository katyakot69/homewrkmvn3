package ru.netology.homewrkmvn3.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSumSales() {

        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = StatsService.sumOfAllSales(numbers);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSalesAmount() {

        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = StatsService.averageSalesAmount(numbers);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }


    @Test
    public void shouldFindMonthNumberMax() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMax = 8;
        int actualMonthMax = StatsService.monthNumberMax(numbers);

        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
    }


    @Test
    public void shouldFindMonthNumberMin() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMin = 9;
        int actualMonthMin = StatsService.monthNumberMin(numbers);

        Assertions.assertEquals(expectedMonthMin, actualMonthMin);
    }

    @Test
    public void shouldFindAmountMonthUnderAverage() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountMonthUnder = 5;
        int actualAmountMonthUnder = StatsService.amountMonthUnderAverage(numbers);

        Assertions.assertEquals(expectedAmountMonthUnder, actualAmountMonthUnder);
    }


    @Test
    public void shouldFindAmountMonthOverAverage() {
        StatsService service = new StatsService();
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountMonthOver = 5;
        int actualAmountMonthOver = StatsService.amountMonthOverAverage(numbers);

        Assertions.assertEquals(expectedAmountMonthOver, actualAmountMonthOver);
    }
}









