package com.aca.week9.homework;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProcessingRunnableDemo {
    public static void main(String[] args) {
        File[] files = new File[10];
        for(int i = 0; i < 10; i++){
            files[i] = new File("C:\\Users\\bagra\\IdeaProjects\\Jw2\\src\\com\\aca\\week9\\homework\\file" + i + ".txt");
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (File file : files){
            FileProcessingRunnable fileProcessingRunnable = new FileProcessingRunnable(file);
            executorService.execute(fileProcessingRunnable);
        }
        executorService.shutdown();
    }
}
