package com.company.chances.generators;

import com.company.chances.Chance;

import java.util.Random;

public class ChanceFabric {
    public Chance genChance() {
        Random rand = new Random();

        int chance = rand.nextInt(10) + 1;
        if (chance % 2 == 0){
            //Return positive chance
            PositiveChanceFabric pcf = new PositiveChanceFabric();
            return pcf.genPositiveChance();
        } else {
            NegativeChanceFabric ncf = new NegativeChanceFabric();
            return ncf.genNegativeChance();
        }
    }
}
