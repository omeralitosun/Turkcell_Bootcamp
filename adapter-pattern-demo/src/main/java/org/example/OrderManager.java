package org.example;

public class OrderManager {
    PosService posService;

    OrderManager(PosService posService){
        this.posService = posService;
    }
    public void makePayment(){

        if (posService.checkPayment()){
            System.out.println("Payment successful");
        }else{
            System.out.println("Payment failure");
        }


    }
}
