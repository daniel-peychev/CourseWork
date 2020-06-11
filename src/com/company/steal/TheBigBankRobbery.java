package com.company.steal;

import com.company.board.BoardField;

public class TheBigBankRobbery extends Steal{

    @Override
    public double getPrice(BoardField field) {
        if (field.getType() == 'S') {
            return 100;
        } else {
            return 0;
        }
    }

    @Override
    public String getDescription() {
        return "Шоколадовата банка е празна, но има и\n"+
            "други институции, които раздават\n"+
            "безплатни пари. Да се захващаме за\n"+
            "работа." ;
    }
}
