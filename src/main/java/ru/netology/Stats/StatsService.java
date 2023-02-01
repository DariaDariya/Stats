package ru.netology.Stats;

public class StatsService {

    public long getSumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sales[i] + sum;
        }
        return sum;
    }

    public long getMiddleSales(long[] sales) {
        long sum = 0;
        for (int i = 0; sales.length > i; i++) {
            sum = sales[i] + sum;
        }
        return (sum / sales.length);
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long getMinMiddleSales(long[] sales) {
        int count = 0;

        long sum = 0;
        for (int i = 0; sales.length > i; i++) {
            if (sales [i] < getMiddleSales(sales)) {
                count++;
            }
        }
        return count;
    }
    public long getMaxMiddleSales(long[] sales) {
        int count = 0;

        long sum = 0;
        for (int i = 0; sales.length > i; i++) {
            if (sales [i] > getMiddleSales(sales)) {
                count++;
            }
        }
        return count;
    }
}