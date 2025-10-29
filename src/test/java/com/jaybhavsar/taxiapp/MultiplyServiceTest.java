package com.jaybhavsar.taxiapp;

import com.jaybhavsar.taxiapp.model.MultiplyService;
import org.assertj.core.util.diff.myers.MyersDiff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyServiceTest {

    @Test
    void testMultiplyByTow() {

        MultiplyService service = new MultiplyService();
        int result = service.multiplyByTwo(4);
        assertEquals(8, result);
    }

    @Test
    void multiplyWithZero() {
        MultiplyService service = new MultiplyService();
        int result = service.multiplyWithZero(4);
        assertEquals(0, result);
    }

    @Test
    void multiplyByFive(){
        MultiplyService service = new MultiplyService();
        int result = service.multiplyByFive(2);
        assertEquals(10, result);
    }
}
