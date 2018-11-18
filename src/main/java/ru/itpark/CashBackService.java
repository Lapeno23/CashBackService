package ru.itpark;

public class CashBackService {
    private int regularPercent = 1;
    private int increasedPercent = 5;
    private int specialPercent = 30;
    private int maxCashBack = 3_000;
    private int regularPurchase;
    private int increasedPurchase;
    private int specialPurchase;
    private int regularCashBack = regularPurchase * regularPercent / 100;
    private int increasedCashBack = increasedPurchase * increasedPercent / 100;
    private int specialCashBack = specialPurchase * specialPercent / 100;

    public int getMaxCashBack() {
        return maxCashBack;
    }

    public void setRegularPurchase(int regularPurchase) {
        this.regularPurchase = regularPurchase;
    }

    public void setIncreasedPurchase(int increasedPurchase) {
        this.increasedPurchase = increasedPurchase;
    }

    public void setSpecialPurchase(int specialPurchase) {
        this.specialPurchase = specialPurchase;
    }

    public int getRegularCashBack() {
        if (regularCashBack >= getMaxCashBack()) {
            return getMaxCashBack();
        } else {
            return regularCashBack;
        }
    }

    public int getIncreasedCashBack() {
        return increasedCashBack;
    }

    public int getSpecialCashBack() {
        return specialCashBack;
    }


    public int calculateCashBack(int regularPurchase) {
        CashBackService cashBackService = new CashBackService();
        cashBackService.setRegularPurchase(regularPurchase);
        System.out.println(regularPurchase);
        System.out.println("dsfdsf");
        return getRegularCashBack();
    }
}
