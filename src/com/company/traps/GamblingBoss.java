package com.company.traps;

import com.company.players.Player;

public class GamblingBoss extends Trap {
    public GamblingBoss(){
        super();
    }

    @Override
    public double getMinInvest() {
        return 100;
    }
}
