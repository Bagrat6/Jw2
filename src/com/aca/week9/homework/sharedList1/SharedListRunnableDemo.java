package com.aca.week9.homework.sharedList1;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedListRunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        File[] files = new File[10];
        for(int i = 0; i < 10; i++){
            files[i] = new File("C:\\Users\\bagra\\IdeaProjects\\Jw2\\src\\com\\aca\\week9\\homework\\file" + i + ".txt");
        }


        for (File file : files){
            SharedListRunnable sharedListRunnable = new SharedListRunnable(file);
            Thread thread = new Thread(sharedListRunnable);

            thread.start();
            thread.join();
        }

    }
}
