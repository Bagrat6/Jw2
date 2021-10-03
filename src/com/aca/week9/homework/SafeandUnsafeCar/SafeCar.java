package com.aca.week9.homework.SafeandUnsafeCar;

public class SafeCar implements Car{
    private String[] passengerNames = new String[6];
    private int count = 0;

    @Override
    public synchronized void add(String passengerName) {
        if(count == 6){
            throw new RuntimeException("Full");
        }else{
            passengerNames[count] = passengerName;
            count++;
        }
    }

    @Override
    public synchronized void printPassengerNames() {
        if(count != 0){
            for(String items:passengerNames){
                System.out.println(items);
            }
        }else {
            throw new RuntimeException("Empty");
        }

    }
}
