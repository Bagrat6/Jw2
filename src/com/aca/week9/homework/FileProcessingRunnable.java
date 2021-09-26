package com.aca.week9.homework;

import java.io.*;

public class FileProcessingRunnable implements Runnable{
    private File file;

    public FileProcessingRunnable(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        int count = 0;
        String subString = "ab";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s;
        try {
            s = bufferedReader.readLine();
            while (s != null){
                if(s.contains(subString)){
                    ++count;
                }
                s = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName() + " - " + count);
    }
}
