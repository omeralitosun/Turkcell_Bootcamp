package org.example;

import java.util.ArrayList;
import java.util.List;

public class EDevletService {

    List<Citizen> citizens = new ArrayList<>();

    public EDevletService() {
        citizens.add(new Citizen("Ömer","Tosun","11111",2000));
        citizens.add(new Citizen("Ömer","Tosun","11112",2003));
    }

    public boolean citizenValidation(Citizen citizen){
        for (Citizen citizen1: citizens) {
            if(citizen1.equals(citizen)){
                return true;
            }
        }
        return false;
    }
}
