package com.company.invest.generators;

import com.company.input.ScannerSingleton;
import com.company.invest.*;

import java.lang.reflect.Array;
import java.util.Random;

public class InvestFabric {
    private Invest getInvest(int number){
        if (number == 1){
            return new BombsAway(0);
        } else if (number == 2){
            return new ClockWorkOrande(0);
        } else if (number == 3){
            return new EvilCo(0);
        } else if (number == 4) {
            return new FatCatIncorporated(0);
        } else if (number == 5){
            return new Macrosoft(0);
        } else if (number == 6){
            return new MarodersUnated(0);
        }
        return null;
    }
    public Invest generateInvest(){
        // Generirame 3 razlichni chisla
        Random rand = new Random();
        int[] randomNums = new int[]{-1, -1, -1};
        Invest[] choices = new Invest[3];
        for (int i = 0; i < 3; i++){
            randomNums[i] = rand.nextInt(6) + 1;
            choices[i] = getInvest(randomNums[i]);
            System.out.println(
                    (i + 1) + ". " + choices[i].getName() +
                            " min: " + choices[i].getMinInvest() +
                            " Coef: " + choices[i].getCoeficien() +
                            " risk: " + choices[i].getRisk()[0] + "/" + choices[i].getRisk()[1]);

        }

        System.out.println("0. Не ми се инвестира повече.");
        int playerChoice = ScannerSingleton.getScanner().nextInt();
        if (playerChoice == 0){
            return null;
        }
        return choices[playerChoice - 1];
    }
}
