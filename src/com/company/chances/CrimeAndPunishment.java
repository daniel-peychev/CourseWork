package com.company.chances;

public class CrimeAndPunishment extends NegativeChance {
    @Override
    public double getEffect() {
        return -200;
    }

    @Override
    public String getDescription() {
        return "На връщане от супермаркета,\n" +
        "чудовище се опитва да ви изяде.\n" +
        "Справяте се с неприятеля,\n" +
        "използвайки карате, но се налага\n" +
        "да пишете обяснения, които водят\n" +
        "до пропускане на важна среща и\n" +
        "загуба на бизнес партньор.";
    }


}
