package com.aca.week4.homework04.interfaces;

public class Dog implements Land{
    @Override
    public void isBreathing() {
        System.out.println("dog is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("dog is running");
    }
}
