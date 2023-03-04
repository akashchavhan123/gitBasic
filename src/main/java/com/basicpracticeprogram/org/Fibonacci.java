package com.basicpracticeprogram.org;

import java.util.Scanner;

public class Fibonacci {
    //0 1 1 2 3 5 8 13 21 ....

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int no;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no ");
        //System.out.print(a+" "+b);
        no = sc.nextInt();
        for (int i = 0;i<=no;i++){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
