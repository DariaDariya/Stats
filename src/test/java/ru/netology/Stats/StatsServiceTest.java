package ru.netology.Stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void getSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void getMiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMiddle = 15;
        long actualMiddle = service.getMiddleSales(sales);
        Assertions.assertEquals(expectedMiddle, actualMiddle);
    }
    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 9;
        long actualMin = service.minSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }
    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 8;
        long actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }
    @Test
    public void getMinMiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMiddle = 5;
        long actualMinMiddle = service.getMinMiddleSales(sales);
        Assertions.assertEquals(expectedMinMiddle, actualMinMiddle);
    }
    @Test
    public void getMaxMiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMiddle = 5;
        long actualMaxMiddle = service.getMaxMiddleSales(sales);
        Assertions.assertEquals(expectedMaxMiddle, actualMaxMiddle);
    }
}

