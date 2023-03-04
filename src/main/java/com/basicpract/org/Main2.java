package com.basicpract.org;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        double a = sc.nextDouble();
        System.out.println("Enter second no");
        double b = sc.nextDouble();
        System.out.println(" Choose valid no:- \n 1.Addition \n 2.subtraction \n 3.Mul \n 4.Div \n 5.Remainder");
        double no = sc.nextDouble();
        if (no == 1) {
            double sum = a + b;
            System.out.println("sum is " + sum);
        } else if (no == 2) {
            double sub = a - b;
            System.out.println("sub is " + sub);
        } else if (no == 3) {
            double mul = a * b;
            System.out.println("mul is " + mul);
        } else if (no == 4) {
            double div = a / b;
            System.out.println("div is " + div);
        } else if (no == 5) {
            double mod = a % b;
            System.out.println("mod is " + mod);

        }
    }
}