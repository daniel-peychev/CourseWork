package com.company.invest;

public class FatCatIncorporated extends Invest {
    public FatCatIncorporated(double investment) {
        super(investment);
    }

    @Override
    public double getMinInvest() {
        return 100;
    }

    @Override
    public double getCoeficien() {
        return 2.5;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-25, 100};
    }

    @Override
    public String getName() {
        return "Fat Cat Incorporated";
    }
}
