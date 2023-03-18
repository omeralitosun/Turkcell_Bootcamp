package turkcell.entities;

import java.util.Date;

public class Campaign
{
    private int id;
    private String name;
    private String description;
    private Date  startDate;
    private Date endDate;
    private int discountRate;

    public Campaign(int id, String name, String description, Date startDate, Date endDate, int discountRate)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountRate = discountRate;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public int getDiscountRate()
    {
        return discountRate;
    }

    public void setDiscountRate(int discountRate)
    {
        this.discountRate = discountRate;
    }
}