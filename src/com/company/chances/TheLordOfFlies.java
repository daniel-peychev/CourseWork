package com.company.chances;

public class TheLordOfFlies extends PositivеChance {
    @Override
    public double getEffect() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Тийнейджъри представят\n" +
                "гениална идея за\n" +
                "рационализиране на\n" +
                "производствените\n" +
                "мощности. Получавате\n" +
                "стабилен бонус. ";
    }
}
