package turkcell.business;



import turkcell.entities.Gamer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EDevletManager
{
    private final List<Gamer> gamers = new ArrayList<Gamer>();

    public EDevletManager()
    {
        gamers.add(new Gamer(1,"","","Ömer Ali","Tosun","12345678910", new Date("03/06/2015"),0));
        gamers.add(new Gamer(2,"","","Emrah","Yılmaz","12345678920", new Date("01/02/1999"),0));
        gamers.add(new Gamer(3,"","","Firuze","Şahin","12345678930", new Date("01/02/2001"),0));
        gamers.add(new Gamer(4,"","","Gizem","Koçyiğit","12345678940", new Date("02/02/2000"),0));
    }

    public boolean control(Gamer gamer)
    {
        for(Gamer gamer1 : gamers)
        {
            if(gamer1.getFirstName().equals(gamer.getFirstName()) && gamer1.getLastName().equals(gamer.getLastName()) && gamer1.getNationalityId().equals(gamer.getNationalityId()) && gamer1.getBirthDay().equals(gamer.getBirthDay()))
            {
                return true;
            }
        }
        return false;
    }
}
