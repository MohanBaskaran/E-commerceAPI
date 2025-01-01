package com.mohancode.cart.controller;

public class Test {

    public static void main(String[] args) {
        count(5);
    }

    public static void count(int i) {
        System.out.println(i);
        if (i == 1) {
            return;
        }
        count(i - 1);
        System.out.println(i);
    }

}

