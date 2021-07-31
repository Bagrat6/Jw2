package com.aca.week4.homework04;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        System.out.println(Laptop.getCounterPublic());
        Laptop laptop3 = new Laptop(47);
        Laptop laptop5 = new Laptop(747);
        Laptop laptop6 = new Laptop(7);
        Laptop laptop7 = new Laptop(4);
        System.out.println(Laptop.getCounterProtected());
    }
}
