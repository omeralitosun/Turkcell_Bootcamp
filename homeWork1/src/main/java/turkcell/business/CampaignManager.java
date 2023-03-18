package turkcell.business;



import turkcell.entities.Campaign;

import java.util.Date;
import java.util.List;

public class CampaignManager {
    private List<Campaign> campaigns;

    public CampaignManager(List<Campaign> campaigns)
    {
        this.campaigns = campaigns;
    }

    public void add(Campaign campaign)
    {
        campaigns.add(campaign);
        System.out.println(campaign.getName() + " kampanyası eklendi.");
    }

    public void delete(Campaign campaign)
    {
        for(Campaign campaign1 : campaigns)
        {
            if(campaign1.getId() == campaign.getId())
            {
                campaigns.remove(campaign);
                System.out.println(campaign1.getName()+ " silindi.");
                return;
            }
        }
        System.out.println("Silinecek kampanya bulunamadı.");
    }

    public void update(int id, String description, Date startDate, Date endDate, int discountRate)
    {
        for(Campaign campaign1 : campaigns)
        {
            if(campaign1.getId() == id)
            {
                campaign1.setDescription(description);
                campaign1.setStartDate(startDate);
                campaign1.setEndDate(endDate);
                campaign1.setDiscountRate(discountRate);
                System.out.println(campaign1.getName() + " güncellendi.");
                return;
            }
        }
        System.out.println("Güncellenecek kampanya bulunamadı.");
    }

}