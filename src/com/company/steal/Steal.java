package com.company.steal;

import com.company.board.BoardField;

import java.lang.reflect.Field;

public abstract class Steal {
    public abstract double getPrice(BoardField field);
    public abstract String getDescription();
}
