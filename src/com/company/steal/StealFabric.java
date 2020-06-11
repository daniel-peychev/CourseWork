package com.company.steal;

import java.util.Random;

public class StealFabric {
    public Steal genSteal(){
        Random rand = new Random();
        int random = rand.nextInt(3);

        if (random == 0){
            return new TakeOverWorld();
        } else if (random == 1){
            return new Hostage();
        } else {
            return new TheBigBankRobbery();
        }
    }
}
