package ru.itpark;

import org.junit.jupiter.api.Test;
import ru.itpark.service.CashBackService;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void calculateCashBack() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(3000, cashBackService.calculateCashBack(1_000_000,0,0));
        assertEquals(1000, cashBackService.calculateCashBack(0,20_000,0));
        assertEquals(3000, cashBackService.calculateCashBack(0,0,100_000));
        assertEquals(100, cashBackService.calculateCashBack(10_000,0,0));
        assertEquals(1500, cashBackService.calculateCashBack(0,0,5_000));
        assertEquals(3000, cashBackService.calculateCashBack(0,200_000,0));
        assertEquals(0, cashBackService.calculateCashBack(0,0,0));
    }
}