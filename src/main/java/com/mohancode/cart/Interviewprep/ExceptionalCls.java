package com.mohancode.cart.Interviewprep;

import java.io.IOException;

public class ExceptionalCls {

    public static void main(String[] args) {
        try {
            riskyMethod(); // Handle the exception thrown by riskyMethod
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void riskyMethod() throws IOException {
        throw new IOException("This is an exception.");
    }
}
