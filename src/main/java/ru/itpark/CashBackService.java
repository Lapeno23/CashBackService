package ru.itpark;

public class CashBackService {
    private int regularPercent = 1;
    private int increasedPercent = 5;
    private int specialPercent = 30;
    private int maxCashBack = 3_000;
    private int regularPurchase;
    private int increasedPurchase;
    private int specialPurchase;
    private int regularCashBack;
    private int increasedCashBack;
    private int specialCashBack;


    public void setRegularPurchase(int regularPurchase) {
        this.regularPurchase = regularPurchase;
    }

    public void setIncreasedPurchase(int increasedPurchase) {
        this.increasedPurchase = increasedPurchase;
    }

    public void setSpecialPurchase(int specialPurchase) {
        this.specialPurchase = specialPurchase;
    }

    public void setRegularCashBack() {
        this.regularCashBack = regularPurchase * regularPercent / 100;
    }

    public void setIncreasedCashBack() {
        this.increasedCashBack = increasedPurchase * increasedPercent / 100;
    }

    public void setSpecialCashBack() {
        this.specialCashBack = specialPurchase * specialPercent / 100;
    }

    public int getRegularCashBack() {
        if (regularCashBack >= maxCashBack) {
            return maxCashBack;
        } else {
            return regularCashBack;
        }
    }

    public int getIncreasedCashBack() {
        if (increasedCashBack >= maxCashBack) {
            return maxCashBack;
        } else {
            return increasedCashBack;
        }
    }

    public int getSpecialCashBack() {
        if (specialCashBack >= maxCashBack) {
            return maxCashBack;
        } else {
            return specialCashBack;
        }
    }

    public void calculateCashBack(int regularPurchase, int increasedPurchase, int specialPurchase) {
        this.setRegularPurchase(regularPurchase);
        this.setRegularCashBack();
        this.setIncreasedPurchase(increasedPurchase);
        this.setIncreasedCashBack();
        this.setSpecialPurchase(specialPurchase);
        this.setSpecialCashBack();
        System.out.println(getRegularCashBack());
        System.out.println(getIncreasedCashBack());
        System.out.println((getSpecialCashBack()));
    }
}
