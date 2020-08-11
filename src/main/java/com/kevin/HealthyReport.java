package com.kevin;

public class HealthyReport implements Report{
    @Override
    public void load() {
        System.out.println("Healthy loading data");
    }

    @Override
    public void print() {
        System.out.println("Healthy printing");
    }
}
