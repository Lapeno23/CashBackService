package ru.itpark;

public class Main {
    public static void main(String[] args) {
        CashBackService cashBackService = new CashBackService();
        System.out.println(cashBackService.calculateCashback(10_000,0,0));

    }
}
