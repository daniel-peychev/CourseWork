package com.company.invest;

public class ClockWorkOrande extends Invest {

    public ClockWorkOrande(double investment) {
        super(investment);
    }

    @Override
    public double getMinInvest() {
        return 300;
    }

    @Override
    public double getCoeficien() {
        return 1.5;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-15, 35};
    }

    @Override
    public String getName() {
        return "Clock Work Orange";
    }
}
