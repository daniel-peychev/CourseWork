package com.company.chances;

public class PrideAndPrejudice extends PositivеChance {
    @Override
    public double getEffect() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Напускате университета и\n" +
                "ставате милионер. Честито! ";
    }
}
