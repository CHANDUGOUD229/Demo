package array;

public class ArraysConcepts {
	


	public static void main(String[] args)
	{
		System.out.println("Singil Dimentional Array Type");
      int a[]={10,20,30,40,50};
      
      for (int i = 0; i < a.length-1; i++) 
      {
    	  
    	  
		    System.out.print(a[i]+"   ");
		
	   }
      System.out.println("integer Data Typea in Array Conspt");
      
      int b[]=new int[5];
      b[0]=100;
      b[1]=200;
      b[2]=300;
      b[3]=400;
      b[4]=500;
      
      for(int i:b)
      {
    	  System.out.print(i+"   ");
      }
      
      
      System.out.println("String Data Typea in Array Conspt");
      String c[]=new String[5];
      c[0]="chandu";
      c[1]="Divya";
      c[2]="bindu";
      c[3]="nandu";
      c[4]="kittu";
      
      for(String j:c)
      {
    	  System.out.print(j+"   ");
      }
      System.out.println("Objective Data Typea in Array Conspt");
      
      Object d[]=new Object[5];
      d[0]=100;
      d[1]=200.33;
      d[2]='c';
      d[3]=true;
      d[4]="chandu";
      
      for(Object i:d)
      {
    	  
    	
    	  System.out.print(i+"   ");
    	  
      }
      
      
      
      
      
      
	}

}
