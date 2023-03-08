package com.assignment;

public class Uc3PartTime {
    public static void main(String[] args) {
        int fullPresent = 1;
        int partTime = 8;
        int fullTime = 16;
        int perHour = 20;
        int halfSalary = partTime*perHour;
        int fullSalary = fullTime*perHour;
        double randomCheck = Math.floor(Math.random()*10)%2;
        if (randomCheck==fullPresent){
            System.out.println("full time wage is"+" "+fullSalary);
        }
        else {
            System.out.println("half time wage is"+" "+halfSalary);
        }
    }
}
