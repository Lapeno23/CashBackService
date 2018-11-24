package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void calculateCashBack() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(3000, cashBackService.calculateCashBack(1_000_000, 0, 0));
    }
}