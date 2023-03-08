package com.assignment;

import java.util.Random;

public class Uc4_Switchcase {
    public static void main(String[] args) {
        int fullPresent = 1;
        int empFullHour = 16;
        int empHalfHour = 8;
        int perHour = 20;
        int fullSalary = empFullHour * perHour;
        int halfSalary = empHalfHour * perHour;
        //double randomCheck = Math.floor(Math.random() * 10) % 2;
        Random random =new Random();
        int randomCheck=random.nextInt(3);
        switch (randomCheck){
            case 1:
                System.out.println("fullTime empwage is "+" "+fullSalary);
                break;
            case 2:
                System.out.println("HalfTime empwage is "+" "+halfSalary);
                break;
            default:
                System.out.println("nothing");
        }

    }
}