package com.company.invest;

import java.util.Random;

public abstract class Invest {
    double investment;

    public Invest(double investment) {
        this.investment = investment;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public abstract double getMinInvest();
    public abstract double getCoeficien();
    public abstract int[] getRisk();
    public double risk(){
        Random rand = new Random();
        int[] risc = getRisk();

        int chance = rand.nextInt(risc[1] - risc[0]);
        chance -= risc[0];

        if(chance > 0){
            return investment * getCoeficien();
        } else if (chance == 0) {
            return 0;
        } else {
            return -(investment * getCoeficien());
        }
    }
    public abstract String getName();
}
