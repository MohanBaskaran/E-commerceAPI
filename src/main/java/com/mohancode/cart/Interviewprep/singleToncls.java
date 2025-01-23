package com.mohancode.cart.Interviewprep;

public class singleToncls {

    public static void main(String[] args) {
        Pen pen= Pen.getInstance();
        Pen pentmp= Pen.getInstance();

        if(pen == pentmp){
            System.out.println("Pen is the same");

        }


    }
}

class Pen {

    private static Pen car;


    private Pen(){

    }
    public  static Pen getInstance(){
        if (car==null){
            car = new Pen();
        }
        return car;
    }

}
