package com.company.steal;

import com.company.board.BoardField;

public class TakeOverWorld extends Steal {
    @Override
    public double getPrice(BoardField field) {
        if (field.getType() == 'C'){
            return 100;
        }

        return 0;
    }

    @Override
    public String getDescription() {
        return "Стереотипно, но изпитано.\n"+
        "Завладяването на света е любим план на\n"+
        "всички зли гении. Ще започнем с леки\n"+
        "сътресения на икономиката и ще видим\n"+
        "до къде ще стигне работата.;";
    }
}
