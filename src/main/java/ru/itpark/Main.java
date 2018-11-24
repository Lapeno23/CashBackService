package ru.itpark;

public class Main {
    public static void main(String[] args) {
        CashBackService cashBackService = new CashBackService();
        System.out.println(cashBackService.calculateCashBack(1_000_000, 20_000, 100_000));

    }
}
