package com.company.chances;

public class BallOfFairies extends NegativeChance {
    @Override
    public double getEffect() {
        return -100;
    }

    @Override
    public String getDescription(){
        return "Вдигате толкова голям купон, че\n" +
                "не знаете къде се намирате на\n" +
                "следващата седмица. С мъка\n" +
                "установявате, че телевизорът Ви е\n" +
                "откраднат.";
    }
}
