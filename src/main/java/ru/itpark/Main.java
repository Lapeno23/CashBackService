package ru.itpark;

public class Main {
    public static void main(String[] args) {
        CashBackService cashBackService = new CashBackService();
        cashBackService.calculateCashBack(10_000);
        System.out.println(cashBackService.getRegularCashBack());
    }
}
