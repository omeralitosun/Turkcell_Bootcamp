package turkcell.entities;

public class AgeLimitGame extends Game
{
    private int ageLimit;
    public AgeLimitGame(int id, String name, double price, int ageLimit)
    {
        super(id, name, price);
        this.ageLimit = ageLimit;
    }

    public int getAgeLimit()
    {
        return ageLimit;
    }

    @Override
    public String toString() {
        return "AgeLimitGame{" +
                ", name ='" + super.getName() +'\'' +
                ", price = " + super.getPrice() + '\'' +
                ", ageLimit = " + this.ageLimit +
                '}';
    }
}