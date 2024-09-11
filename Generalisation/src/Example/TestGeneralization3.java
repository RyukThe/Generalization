package Example;

public class TestGeneralization3 
{
	public static void main(String[] args)
	{
		System.out.println("................Specifications of Iphone.................");
		Iphone i=new Iphone();
		i.SmartPhone();
		i.ram();
		i.storage();
		i.processor();
		i.camera();
		i.display();
		i.batterylife();
		i.Charger();
		
		System.out.println("................Specifications of OnePlus.................");
		Oneplus o=new Oneplus();
		o.SmartPhone();
		o.ram();
		o.storage();
		o.processor();
		o.camera();
		o.display();
		o.batterylife();
		o.Charger();
		
		System.out.println("................Specifications of Samusung.................");
		Samsung s=new Samsung();
		s.SmartPhone();
		s.ram();
		s.storage();
		s.processor();
		s.camera();
		s.display();
		s.batterylife();
		s.Charger();
	}
}
