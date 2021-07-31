package com.aca.week4.homework04.interfaces;

public class Fish implements Water{
    @Override
    public void isSwimming() {
        System.out.println("fish is swimming");
    }

    @Override
    public void isBreathing() {
        System.out.println("fish is breathing");
    }
}
