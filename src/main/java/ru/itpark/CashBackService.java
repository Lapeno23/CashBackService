package ru.itpark;

import java.awt.*;

public class CashBackService {
    public int calculateCashback(int simplePurchase, int unsimplePurchase, int specialPurches) {

        int simplePercent = 1;
        int unsimplePercent = 5;
        int specialPercent = 30;
        int upperBound = 3_000;
        int simpleCashback = simplePurchase * simplePercent / 100;
        int unSimpleCashback = unsimplePurchase * unsimplePercent / 100;
        int specialCashback = specialPurches * specialPercent / 100;



 //       CashBackService simpleCashBack = new CashBackService();
  //      boolean result = simpleCashBack.equals(upperBound);
//
 //       if (result) {
 //           return upperBound;
//            return simpleCashback;
   //     }

    }

}
