package turkcell.entities;

import java.util.Date;

public class Sale
{
    private int id;
    private Game game;
    private Gamer gamer;
    private Campaign campaign;
    private Date saleDate;
    private double price;

    public Sale(int id, Game game, Gamer gamer, Campaign campaign, Date saleDate, double price)
    {
        this.id = id;
        this.game = game;
        this.gamer = gamer;
        this.campaign = campaign;
        this.saleDate = saleDate;
        this.price = price;
    }
    
    public int getId()
    {
        return id;
    }

    public Game getGame()
    {
        return game;
    }

    public Gamer getGamer()
    {
        return gamer;
    }

    public Campaign getCampaign()
    {
        return campaign;
    }

    public Date getSaleDate()
    {
        return saleDate;
    }

    public double getPrice()
    {
        return price;
    }
}