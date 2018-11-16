package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void calculateCashback() {
        CashBackService cashBackService = new CashBackService();
        int cashback = cashBackService.calculateCashback(5_000, 100_000, 2_000);


    }
}