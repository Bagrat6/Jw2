package com.aca.week9.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class RunnableImpl implements Runnable{

    private File file;

    public RunnableImpl(String path) {
        this.file = new File(path);
    }

    @Override
    public void run() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for(int i = 0; i < 10000; i++){
                fileOutputStream.write((UUID.randomUUID() + "\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
