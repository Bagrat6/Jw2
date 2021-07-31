package com.aca.week4.homework04;

import java.util.ArrayList;
import java.util.List;

public class Pi {
    public static void main(String[] args) {
        List<Double> list= new ArrayList<Double>();
        list.add(Math.PI);
        double pi = list.get(0);
        System.out.println(pi);
    }
}
