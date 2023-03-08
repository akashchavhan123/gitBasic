package com.assignment;

public class DailyWage {
    public static void main(String[] args) {
        int present = 1;
        int perHour = 20;
        int fullDay = 8;
        int salary = perHour*fullDay;
        double randomCheck = Math.floor(Math.random()*10)%2;
        if (randomCheck == present){
            System.out.println("dailyEmployee Wage"+salary);
        }else {
            System.out.println("zero");
        }

    }
}
