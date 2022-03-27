package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 789;
        int a = 0;
        int b = 0;
        int d = 0;
        int a1;
        int b1;
        int d1;

        a1 = n % 10;
        a = a+a1;


        b1 = n % 100;
        b = b+b1;
        b1 = b1/10;


        d1 = n%1000;
        d = d+d1;
        d1 = d1/100;


        if((a1 >b1) && (a1>d1))
            System.out.println(a1 + " Це число найбільше.");
        if((b1 >a1) && (b1>d1))
            System.out.println(b1 +" Це число найбільше.");
        if((d1>a1) && (d1>b1))
            System.out.println(d1 +" Це число найбільше.");

    }
}