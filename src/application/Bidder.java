package application;

public class Bidder implements IBidder
{
	public String s1;
	
	public Bidder(String s)
	{
		this.s1=s;
	}
	
    public void bid(String d)
    {
  
        double price=Double.parseDouble(d);
	
		if(price > Auctioneer. cprice)
		{
			Auctioneer.getbidding(price);
		}
	
		else
		{
			System.out.println("Not sufficient");
			Auctioneer.getbidding(Auctioneer. cprice);
		}
    }
    
    public String getNotification()
	{
		return Double.toString(Auctioneer.cprice);
	}
}
