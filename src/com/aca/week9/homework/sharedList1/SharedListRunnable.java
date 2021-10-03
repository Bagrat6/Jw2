package com.aca.week9.homework.sharedList1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SharedListRunnable implements Runnable{

    private File file;
    private List<String> list = new ArrayList<>();
    private int count;

    public SharedListRunnable(File file) {
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
                if (s.contains(subString)){
                    count++;
                }
                s = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.add(file.getName() + " - " + count);
        print();
    }

    public void print(){
        for(String item : list){
            System.out.println(item);
        }
    }
}
