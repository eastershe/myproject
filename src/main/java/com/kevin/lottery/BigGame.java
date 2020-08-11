package com.kevin.lottery;

public class BigGame extends NumberGame{
    int numberCount = 6;

    @Override
    public void generate() {
        validate();
    }
}
