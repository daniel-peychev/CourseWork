package com.company.chances;

public class Hobbit extends PositivеChance {
    @Override
    public double getEffect() {
        return 250;
    }

    @Override
    public String getDescription() {
        return "Наемате джудже за личен"+
       " асистент, обществото е\n"+
       "уверено че междувидовата\n"+
        "сегрегация е в историята.\n"+
        "Уважението към вас е\n"+
        "безгранично.\n";
    }

}
