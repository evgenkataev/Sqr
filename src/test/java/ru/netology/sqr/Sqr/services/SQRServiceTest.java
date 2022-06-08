package ru.netology.sqr.Sqr.services;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testSetValues() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(200, 300));

    }

    @Test
    public void testAnotherValues() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(100, 500));

    }

    @Test
    public void testLowValues() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(0, 99));

    }

    @Test
    public void testMaxSquares() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(100, 15000));


    }


}
