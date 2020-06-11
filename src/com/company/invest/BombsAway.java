package com.company.invest;

public class BombsAway extends Invest {
    public BombsAway(double investment) {
        super(investment);
    }

    @Override
    public double getMinInvest() {
        return 400;
    }

    @Override
    public double getCoeficien() {
        return 0.5;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-5, 100};
    }

    @Override
    public String getName() {
        return "Bombs away";
    }
}
