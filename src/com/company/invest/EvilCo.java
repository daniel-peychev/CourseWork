package com.company.invest;

public class EvilCo extends Invest {

    public EvilCo(double investment) {
        super(investment);
    }

    @Override
    public double getMinInvest() {
        return 500;
    }

    @Override
    public double getCoeficien() {
        return 0.2;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-5, 100};
    }

    @Override
    public String getName() {
        return "Evil Co";
    }
}
