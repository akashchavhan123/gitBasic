package com.basicpract.org;

public class A {
    int a = 10;//Instance variable
    static int b;//Static variable
    void Sum(){
        int c = 30,d; //local variable
        d = a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        A ob = new A();
        ob.Sum();
        System.out.println(ob.a);
        System.out.println(b);
        ob.a = 100;
        ob.b = 200;
        System.out.println(ob.a);
        System.out.println(b);
        A ob2 = new A();
        System.out.println(ob2.a);
        System.out.println(ob2.b);
    }
}
