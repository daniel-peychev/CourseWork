package com.company.chances;

public class WarAndPeace extends NegativeChance {
    @Override
    public double getEffect() {
        return -150;
    }

    @Override
    public String getDescription() {
        return "Най-добрият Ви служител\n" +
                "получава повиквателна за\n" +
                "казармата. Губите обучен\n" +
                "персонал. ";
    }
}
