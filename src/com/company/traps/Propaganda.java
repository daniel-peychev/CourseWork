package com.company.traps;

import com.company.players.Player;

public class Propaganda extends Trap {
    public Propaganda(){
        super();
    }

    @Override
    public double getMinInvest() {
        return 100;
    }
}
