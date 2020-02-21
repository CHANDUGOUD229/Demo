package inheritence;

public class ChildClass extends ParentClass
{
  int 	c=100;
   int  d=200;
	int display()
	{
		c=c;
		d=d;
		return c+d;
	}
	
	
	
	void login()
	{        super.login();
		System.out.println("Child Login");
	}
	void logout()
	{ super.logout();
		System.out.println("Child Logout");
	}
	
	
	ChildClass()
	{
		System.out.println("ChildClass Conctractor");
	}
	
	
	

	public static void main(String[] args) 
	{
	 ChildClass cs=new ChildClass();
	 System.out.println(cs.x);
	 System.out.println(cs.y);
	 cs.login();
	 cs.logout();
	int w=cs.display();
	System.out.println(w);

	}

}
