package application;

import java.util.ArrayList;

public class Auctioneer
{
	public static ArrayList<Bidder> bidder=new ArrayList<>();
	public static double cprice=1000;
	public static String s;

	
	public void register(Bidder o) 
	{
		bidder.add(o);
	}
	
	public void showbidders()
	{
		 for (int i = 0; i < bidder.size();i++) 
	      { 		      
	          System.out.println(bidder.get(i)); 		
	      }   
	}

	public static void getbidding(double price)
	{
		cprice=price;
		notifyBidders();
	}
	
	public static void notifyBidders()
	{
		s="";
		
		for(int i=0;i<bidder.size();i++)
		{
			 s += bidder.get(i).getNotification()+ " ,";
		}
	} 
	
	
}
