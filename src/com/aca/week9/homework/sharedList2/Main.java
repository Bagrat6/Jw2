package com.aca.week9.homework.sharedList2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 1; j <= 500; j++){
                        list.add((Integer) j);
                    }
                }
            });
            thread.start();
            thread.join();
        }
        System.out.println(list.size());

    }
}
