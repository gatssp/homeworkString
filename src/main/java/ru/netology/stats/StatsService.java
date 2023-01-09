package ru.netology.stats;

public class StatsService {
    public long sumAllSales(long[] sales) {
        long allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }
        return allSales;
    }

    public long averageSales(long[] sales) {
        long averageSales = sumAllSales(sales) / sales.length;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        long maxSales = 0;
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
        long minSales = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public int belowAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (averageSales(sales) > sale) {
                counter += 1;
            }
        }
        return counter;
    }
    public int aboveAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (averageSales(sales) < sale) {
                counter += 1;
            }
        }
        return counter;
    }

}

