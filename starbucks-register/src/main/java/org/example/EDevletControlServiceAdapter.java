package org.example;

public class EDevletControlServiceAdapter implements ControlService{
    @Override
    public boolean validation(Customer customer) {
        EDevletService eDevletService = new EDevletService();
        return eDevletService.citizenValidation(new Citizen(customer.getName(),customer.getSurName(), customer.getNationalityId(), customer.getBirthYear()));
    }
}
