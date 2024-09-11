package Generalisation;

public class Airtel implements Simcard
{
	public void sms() 
	{
		System.out.println("sms: 200");
	}
	
	public void audioCalling() 
	{
		System.out.println("audioCalling: 600");
	}
	
	public void data() 
	{
		System.out.println("data: 2GB");
	}
	
	public void newFeatureB() 
	{
		System.out.println("newFeature: B");
	}

}
