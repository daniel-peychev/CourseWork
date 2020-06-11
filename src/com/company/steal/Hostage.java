package com.company.steal;

import com.company.board.BoardField;

public class Hostage extends Steal {
    @Override
    public double getPrice(BoardField field) {
        if (field.getType() == 'I'){
            return 100;
        }

        return 0;
    }

    @Override
    public String getDescription() {
        return "Отвличането на кралското семейство не е\n"+
        "опция, но можем да отвлечем друг важен\n"+
        "персонаж. Ще ни плащат всеки месец и\n"+
        "ще си живеем добре.😊;\n";
    }
}
