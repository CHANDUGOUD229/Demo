package methods;

import java.util.ArrayList;
public class Methodss

{
	
	
	int a=100;
	int c=105;

	void printingDetails(int a,int c)
	 { 
		this.a=a;
		this.c=c;
		System.out.println(a+c);
		 
	 }

	public void addargs(int a, int b)
	{
		System.out.println(a+b);
		
	}
	
	Methodss(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	public Object addargs(String a, int b,String c)
	{

		return a+"  "+b+"  "+c;
	}
	
	 ArrayList<Object> addargs(int a,String b,char s,double c)
  {
	  ArrayList<Object>  ss=new ArrayList<Object>();
	  ss.add(a);
	  ss.add(b);
	  ss.add(s);
	  ss.add(c);
	  return ss;
	  
	  
	  
	  
  }
	 void printDetails()
	 {
		 System.out.println(100*522);
	 }
	 
	
	 
    Methodss()
	{
		System.out.println("chandugoud");
	}
	public static void main(String[] args)
	{
		Methodss d=	new Methodss(100,200);
	    d.printingDetails(1, 2);
	    d.addargs(122, 154);
		
	
	  
	
	
}
   
	
	 
	
	
	
	
	


	}
