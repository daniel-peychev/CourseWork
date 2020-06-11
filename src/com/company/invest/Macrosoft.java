package com.company.invest;

public class Macrosoft extends Invest {

    public Macrosoft(double investment) {
        super(investment);
    }

    @Override
    public double getMinInvest() {
        return 50;
    }

    @Override
    public double getCoeficien() {
        return 5;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-20, 10};
    }

    @Override
    public String getName() {
        return "Macrosoft";
    }
}
