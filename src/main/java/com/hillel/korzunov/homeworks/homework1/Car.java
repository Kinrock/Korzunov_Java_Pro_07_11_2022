package com.hillel.korzunov.homeworks.homework1;

public class Car {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.start();

    }


    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity turns on...");
    }

    private void startCommand() {
        System.out.println("Command starts...");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system turns on...");
    }
}
