package com.mohancode.cart.Interviewprep;

public class OopsConcepts extends Abscls implements interFace {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called before object is destroyed.");
    }
    public static void main(String[] args) {

        OopsConcepts obj = new OopsConcepts();
        obj = null; // Make the object eligible for garbage collection
        System.gc(); // Suggest the JVM to run the garbage collector
        System.out.println("Garbage collection requested.");

        Car car = new Car();
        car.setColour("Red");
        car.setEngineCC(1500);
        car.setGasCapacity(50);
        System.out.println(car.toString());

        OopsConcepts oopsConcepts = new OopsConcepts();
        oopsConcepts.fun();
        oopsConcepts.implementations();

    }

    @Override
    public void fun() {
        System.out.println("this is a abstract class and abstract method");
    }

    @Override
    public void implementations() {
        System.out.println("this is a abstract class and abstract method");
        super.implementations();
        System.out.println("this is a abstract class and abstract method");
    }
}

class Car {
    private String colour;
    private int engineCC;
    private int gasCapacity;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(int gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", engineCC=" + engineCC +
                ", gasCapacity=" + gasCapacity +
                '}';
    }
}

abstract class Abscls {
    public abstract void fun();

    public void implementations() {
        System.out.println("we can able to add implement methods in abstract class");
    }
}

interface interFace {
    void fun();

    void implementations();
}
