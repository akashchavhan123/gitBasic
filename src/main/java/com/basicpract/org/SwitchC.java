package com.basicpract.org;

import java.util.Scanner;

public class SwitchC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b  = sc.nextInt();
        System.out.println("Choose valid No : \n 1.add \n 2.sub \n 3.Mul \n 4.Div \n 5.Remainder");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                int sum = a+b;
                System.out.println("sum is"+ sum);
                break;
            case 2:
                int sub = a-b;
                System.out.println("sub is"+ sub);
                break;
            case 3:
                int mul = a*b;
                System.out.println("mul is"+ mul);
                break;
            case 4:
                int div = a/b;
                System.out.println("div is"+ div);
                break;
            case 5:
                int mod = a/b;
                System.out.println("Remainder is"+ mod);
                break;
        }
    }
}
