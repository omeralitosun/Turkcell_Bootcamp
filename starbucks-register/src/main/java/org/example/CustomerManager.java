package org.example;

public class CustomerManager {
    ControlService controlService;

    public CustomerManager(ControlService controlService) {
        this.controlService = controlService;
    }

    void add(Customer customer){
        if(!controlService.validation(customer)){
            System.out.println("Ekleme başarsız. Edevlet kontrol sağlanamadı");
        }else {
            System.out.println("Eklendi.");
        }

    }
}
