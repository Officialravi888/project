package org.example;

public abstract class Pc implements Laptop {
    public void current() {
        System.out.println("current supply pc");
    }
    public void battery(){
            System.out.println("battery 4 hours");
        }
    public void hp(){
        System.out.println("hp laptop 45000");
    }
}
