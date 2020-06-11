package com.company.invest;

public class MarodersUnated extends Invest {

    public MarodersUnated(double investment) {
        super(investment);
    }

    @Override
    public double getMinInvest() {
        return 200;
    }

    @Override
    public double getCoeficien() {
        return 2;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-20, 10};
    }

    @Override
    public String getName() {
        return "Maroders Unated";
    }
}
