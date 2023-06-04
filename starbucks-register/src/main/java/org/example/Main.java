package org.example;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new EDevletControlServiceAdapter());

        customerManager.add(new Customer("Ömer","Tosun","11111",2000));
        customerManager.add(new Customer("Ömer","Tosun","11111",2001));
    }
}