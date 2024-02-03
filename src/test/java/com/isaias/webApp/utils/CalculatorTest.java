package com.isaias.webApp.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(6, calculator.add(4, 2));
    }
}
