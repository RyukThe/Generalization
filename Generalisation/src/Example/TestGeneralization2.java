package Example;

public class TestGeneralization2 
{
	public static void main(String[]args)
	{
		System.out.println("......Asus laptop Specification......");
		Asus a= new Asus();
		a.laptopname();
		a.processor(); 
		a.ram();
		a.ssd();
		a.GraphicCard();
		
		System.out.println("......HP laptop Specification......");
		HP h=new HP();
		h.laptopname();
		h.processor();
		h.ram();
		h.ssd();
		h.GraphicCard();
		h.newfeatures();
		
		System.out.println("......Lenovo laptop Specification......");
		Lenovo l=new Lenovo();
		l.laptopname();
		l.processor();
		l.ram();
		l.ssd();
		l.GraphicCard();
		l.Newfeature();
	}
}
