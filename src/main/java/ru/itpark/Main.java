package ru.itpark;

public class Main {
    public static void main(String[] args) {
        CashBackService cashBackService = new CashBackService();
        cashBackService.calculateCashBack(1_000_000, 20_000, 100_000);
        System.out.println(cashBackService.getRegularCashBack());
        System.out.println(cashBackService.getIncreasedCashBack());
        System.out.println(cashBackService.getSpecialCashBack());
    }
}
