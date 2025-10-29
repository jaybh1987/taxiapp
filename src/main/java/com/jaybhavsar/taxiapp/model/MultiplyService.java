package com.jaybhavsar.taxiapp.model;

import java.beans.PropertyEditorSupport;

public class MultiplyService {

    public int multiplyByTwo(int number) {

        return number * 2;
    }

    public int multiplyWithZero(int number) {
        return number * 0;
    }

    public int multiplyByFive(int number) {
        return number * 5;
    }
}
