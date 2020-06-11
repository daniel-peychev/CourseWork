package com.company.traps;

public class TrapFabric {
    public Trap genTrap(int trapNumber){
        if (trapNumber == 1){
            return new TaxAudit();
        } else if (trapNumber == 2){
            return new DivorceForCats();
        } else if (trapNumber == 3){
            return new Propaganda();
        } else if (trapNumber == 4){
            return new Viewing();
        } else if (trapNumber == 5){
            return new GamblingBoss();
        } else {
            return null;
        }
    }

    public void getTrapCouces(){
        System.out.println("* (1) : Данъчна ревизия (100 шп)");
        System.out.println("* (2) : Развод по котешки (200 шп)");
        System.out.println("* (3) : Пропаганда (100 шп)");
        System.out.println("* (4) : Проглеждане (50 шп)");
        System.out.println("* (5) : Хазартен бос (100 шп)");
        System.out.println("* (N) : Не, благодаря, не вярвам в злото");
    }
}
