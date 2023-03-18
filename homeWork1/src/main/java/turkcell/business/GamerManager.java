package turkcell.business;


import turkcell.entities.Gamer;

import java.util.List;

public class GamerManager
{
    private List<Gamer> gamers;

    public GamerManager(List<Gamer> gamers)
    {
        this.gamers = gamers;
    }

    public void add(Gamer gamer)
    {
        EDevletManager eDevletManager = new EDevletManager();
        if(eDevletManager.control(gamer))
        {
            gamers.add(gamer);
            System.out.println(gamer.getFirstName() + " eklendi.");
        }
        else
        {
            System.out.println("Bilgiler doğrulanamdı. Kullanıcı ekleme başarısız.");
        }
    }

    public void delete(Gamer gamer)
    {
        for (Gamer gamer1 : gamers)
        {
            if (gamer1.getId() == gamer.getId())
            {
                gamers.remove(gamer);
                System.out.println(gamer1.getFirstName() + ", silindi.");
                return;
            }
        }
        System.out.println("Silinecek oyuncu bulunamadı.");
    }

    public void update(int id, String userName, String password)
    {
        for(Gamer gamer1 : gamers)
        {
            if(gamer1.getId() == id)
            {
                gamer1.setUserName(userName);
                gamer1.setPassword(password);
                System.out.println(gamer1.getFirstName() + ", bilgileriniz güncellendi.");
                return;
            }
        }
        System.out.println("Bilgiler güncellenemedi. Bu id'ye sahip oyuncu bulunamadı.");
    }
}