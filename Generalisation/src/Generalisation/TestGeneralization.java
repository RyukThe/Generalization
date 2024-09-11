package Generalisation;

public class TestGeneralization 
{
	public static void main(String[] args) 
	{
		System.out.println("---Features of Jio Simcard-----");
		Jio j=new Jio();
		j.sms();
		j.audioCalling();
		j.data();
		j.newFeatureA();
		
		System.out.println("-----Features of Airtel Simcard-------");
		Airtel a=new Airtel();
		a.sms();
		a.audioCalling();
		a.data();
		a.newFeatureB();
		
		System.out.println("-----Features of VI Simcard-------");
		VI v=new VI();
		v.sms();
		v.audioCalling();
		v.data();
		v.newFeatureC();
		
	}
}
