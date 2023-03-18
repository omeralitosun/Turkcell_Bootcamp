package turkcell;


import turkcell.business.CampaignManager;
import turkcell.business.GamerManager;
import turkcell.business.SaleManager;
import turkcell.entities.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        CampaignManager campaignManager = new CampaignManager(new ArrayList<Campaign>());
        GamerManager gamerManager = new GamerManager(new ArrayList<Gamer>());
        SaleManager saleManager = new SaleManager(new ArrayList<Sale>());


        Game game1 = new Game(1, "g1", 100);
        Game game2 = new AgeLimitGame(2, "g2", 100, 18);

        Gamer gamer1 = new Gamer(1,"nick","1234","Ömer Ali","Tosun","12345678910", new Date("03/06/2015"),100);
        Gamer gamer2 = new Gamer(2,"nick1","1234","Emrah","Yılmaz","12345678920", new Date("01/02/1999"),200);
        Gamer gamer3 = new Gamer(3, "nick2", "1234", "Gizem", "Koçyiğit", "1234", new Date("06/19/2001"), 200);

        Campaign campaign1 = new Campaign(1, "camp1", "onluk", new Date(), new Date(), 10);
        Campaign campaign2 = new Campaign(2, "camp2", "yirmilik", new Date(), new Date(), 20);

        campaignManager.add(campaign1);
        campaignManager.add(campaign2);
        campaignManager.delete(campaign1);
        campaignManager.update(2, "arttırma", new Date(), new Date(), 30);

        gamerManager.add(gamer1);
        gamerManager.add(gamer2);
        gamerManager.add(gamer3);

        gamerManager.update(1, "nick0", "321");

        saleManager.saleService(gamer1, game1, campaign1);
        saleManager.saleService(gamer1, game2, campaign2);

        saleManager.saleService(gamer2, game1, campaign1);
        saleManager.saleService(gamer2, game2, campaign2);

        gamerManager.delete(gamer2);
    }
}