package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        return Arrays.stream(sales).sum();
    }

    public long calculateAverageMonthlySales(long[] sales) {
        return calculateTotalSales(sales) / sales.length;
    }

    public int findMonthWithMaxSales(long[] sales) {
        long maxSales = sales[0];
        int maxSalesMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxSalesMonth = i;
            }
        }

        return maxSalesMonth + 1;
    }

    public int findMonthWithMinSales(long[] sales) {
        long minSales = sales[0];
        int minSalesMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minSalesMonth = i;
            }
        }

        return minSalesMonth + 1;
    }

    public int calculateMonthsBelowAverageSales(long[] sales) {
        long averageSales = calculateAverageMonthlySales(sales);
        int monthsBelowAverage = 0;

        for (long sale : sales) {
            if (sale < averageSales) {
                monthsBelowAverage++;
            }
        }

        return monthsBelowAverage;
    }

    public int calculateMonthsAboveAverageSales(long[] sales) {
        long averageSales = calculateAverageMonthlySales(sales);
        int monthsAboveAverage = 0;

        for (long sale : sales) {
            if (sale > averageSales) {
                monthsAboveAverage++;
            }
        }

        return monthsAboveAverage;
    }
}


