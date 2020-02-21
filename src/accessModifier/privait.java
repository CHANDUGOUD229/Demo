package accessModifier;

public class privait 
{

	private int money=1000;
	
	
	private void display()
	{
		System.out.println(money);
	}
	
	
	
	
	public static void main(String[] args)
	{
		privait s=new privait();
		s.display();
		
	}	
	
	
	
	
}
