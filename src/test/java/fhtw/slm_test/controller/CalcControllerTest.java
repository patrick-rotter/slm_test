package fhtw.slm_test.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcControllerTest {

    @Test
    void calcCmFromInch() {
        CalcController calcController = new CalcController();
        double result = calcController.calcCmFromInch(2);
        assertEquals(result, 5.08);
    }

    @Test
    void calcYardToMeter() {
        CalcController calcController = new CalcController();
        double result = calcController.calcYardToMeter(3);
        assertEquals(result, 2.742230347349177);
    }
}