package com.company.chances;

public class TheClustersOfAnger extends NegativeChance {
    @Override
    public double getEffect() {
        return -250;
    }

    @Override
    public String getDescription() {
        return "Част от бизнесите Ви фалират,\n" +
                "заради задаваща се епидемия от\n" +
                "потна треска. ";
    }
}
