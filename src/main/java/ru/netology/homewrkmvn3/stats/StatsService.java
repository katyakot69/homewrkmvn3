package ru.netology.homewrkmvn3.stats;

public class StatsService {
    public static int sumOfAllSales(int[] sales) {

        int sumSales = 0;

        for (int number : sales) {
            sumSales += number;
        }

        return sumSales;
    }

    public static int averageSalesAmount(int[] sales) {

        int averageAmount = 0;
        for (int x : sales) {
            averageAmount += x;
        }
        return averageAmount / sales.length;
    }

    public static int monthNumberMax(int[] sales) {

        int monthMax = 0;
        int x = 0;
        for (int sale : sales) {
            if (sale >= sales[monthMax]) {
                monthMax = x;
            }
            x = x + 1;
        }

        return monthMax + 1;
    }


    public static int monthNumberMin(int[] sales) {
        int monthMin = 0;
        int x = 0;
        for (int sale : sales) {
            if (sale <= sales[monthMin]) {
                monthMin = x;
            }
            x = x + 1;
        }

        return monthMin + 1;
    }

    public static int amountMonthUnderAverage(int[] sales) {
        int amountMonthUnder = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSalesAmount(sales)) {
                amountMonthUnder++;

            }
        }
        return amountMonthUnder;
    }

    public static int amountMonthOverAverage(int[] sales) {
        int amountMonthOver = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageSalesAmount(sales)) {
                amountMonthOver++;

            }
        }
        return amountMonthOver;

    }
}






