package com.aca.week4.homework04.interfaces;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Fish fish = new Fish();
        Frog frog = new Frog();

        dog.isBreathing();
        dog.isRunning();

        fish.isBreathing();
        fish.isSwimming();

        frog.isBreathing();

    }
}
