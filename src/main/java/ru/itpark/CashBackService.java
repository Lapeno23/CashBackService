package ru.itpark;

public class CashBackService {
    private int increasedPercent = 5;
    private int specialPercent = 30;
    private int maxCashBack = 3_000;
    private int regularPurchase;
    private int increasedPurchase;
    private int specialPurchase;

    private int RegularCashBack() {
        return getRegularPurchase() * getRegularPercent() / 100;
    }

    private int increasedCashBack = increasedPurchase * increasedPercent / 100;
    private int specialCashBack = specialPurchase * specialPercent / 100;

    public int getMaxCashBack() {
        return maxCashBack;
    }

    public int getRegularPercent() {
        return 1;
    }

    public void setMaxCashBack(int maxCashBack) {
        this.maxCashBack = maxCashBack;
    }

    public int getRegularPurchase() {
        return regularPurchase;
    }

    public void setRegularPurchase(int regularPurchase) {
        this.regularPurchase = regularPurchase;
    }

    public void calculateCashBack(int regularPurchase) {
        this.setRegularPurchase(regularPurchase);
        CashBackService calculateRegularCashBack = new CashBackService();
        int regularCashBack = calculateRegularCashBack.RegularCashBack();
    }
}
