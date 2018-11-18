package ru.itpark;

import java.awt.*;

public class CashBackService {
    private int simplePercent = 1;
    private int unsimplePercent = 5;
    private int specialPercent = 30;
    private int maxCashBack = 3_000;
    private int simplePurchase;
    private int unsimplePurchase;
    private int specialPurches;
    private int simpleCashback = simplePurchase * simplePercent / 100;
    private int unSimpleCashback = unsimplePurchase * unsimplePercent / 100;
    private int specialCashback = specialPurches * specialPercent / 100;

    public int getMaxCashBack() {
        return maxCashBack;
    }

    public int getSimplePurchase() {
        return simplePurchase;
    }

    public void setSimplePurchase(int simplePurchase) {
        this.simplePurchase = simplePurchase;
    }

    public int getUnsimplePurchase() {
        return unsimplePurchase;
    }

    public void setUnsimplePurchase(int unsimplePurchase) {
        this.unsimplePurchase = unsimplePurchase;
    }

    public int getSpecialPurches() {
        return specialPurches;
    }

    public void setSpecialPurches(int specialPurches) {
        this.specialPurches = specialPurches;
    }

    public int getSimpleCashback() {
        return simpleCashback;
    }

    public void setSimpleCashback(int simpleCashback) {
        if (simpleCashback >= getMaxCashBack()) {
            this.simpleCashback = getMaxCashBack();
        } else {
            this.simpleCashback = getSimpleCashback();
        }
    }

    public int getUnSimpleCashback() {
        return unSimpleCashback;
    }

    public void setUnSimpleCashback(int unSimpleCashback) {
        if (unSimpleCashback >= getMaxCashBack()) {
            this.unSimpleCashback = getMaxCashBack();
        } else {
            this.unSimpleCashback = getUnSimpleCashback();
        }
    }

    public int getSpecialCashback() {
        return specialCashback;
    }

    public void setSpecialCashback(int specialCashback) {
        if (specialCashback >= getMaxCashBack()) {
            this.specialCashback = getMaxCashBack();
        } else {
            this.specialCashback = getSpecialCashback()
        }

    }

    public int calculateCashBack(int simplePurchase, int unsimplePurchase, int specialPurches) {

    }
}
