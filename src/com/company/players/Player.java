package com.company.players;

import com.company.traps.Trap;

public abstract class Player {
    int position;
    Trap trap;

    public Trap getTrap() {
        return trap;
    }

    public void setTrap(Trap trap) {
        this.trap = trap;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        if (position >=0 && position < 20){
            this.position = position;
        }

    }

    public Player() {
        this.position = 0;
    }
}
