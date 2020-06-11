package com.company.traps;

import com.company.players.Player;

public class TaxAudit extends Trap {
    public TaxAudit(){
        super();
    }

    @Override
    public double getMinInvest() {
        return 100;
    }
}
