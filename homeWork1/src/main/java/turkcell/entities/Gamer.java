package turkcell.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gamer
{
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private Date birthDay;
    private List<Game> games = new ArrayList<Game>();
    private double balance;
    public Gamer(int id, String userName, String password, String firstName, String lastName, String nationalityId, Date birthDay, double balance)
    {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.birthDay = birthDay;
        this.balance = balance;
    }
    public int getId()
    {
        return id;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getNationalityId()
    {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId)
    {
        this.nationalityId = nationalityId;
    }

    public Date getBirthDay()
    {
        return birthDay;
    }

    public List<Game> getGames()
    {
        return games;
    }

    public void addGames(Game game)
    {
        this.games.add(game);
    }

    public void deleteGames(Game game)
    {
       this.games.remove(game);
    }
    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", games=" + games.toString() +
                '}';
    }
}