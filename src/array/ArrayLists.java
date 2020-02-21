package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayLists {

	public static void main(String[] args) 
	{
           ArrayList<String> name=new ArrayList<String>();
           
           name.add("chandra shekhar");
           name.add("chandu ");
           
           name.add("chandra ");
           name.add(" shekhar");
           name.add("ch ");
           
           System.out.println("syso Printing"+name);
           System.out.println();
           System.out.println();
           name.add(2,"ammu");
           System.out.println();
           System.out.println("Ofter Adding Ammu Name"+name);
           //get Data Using For LOOP
           
           for (int i = 0; i < name.size(); i++)
           {
        	   
        	   System.out.println(name.get(i)+"  ");
			}
           System.out.println();
           //get Data Using For each LOOP
           System.out.println("get Data Using For each LOOP");
           for(String i:name)
           {
        	   System.out.print(i+"   ");
           }
           System.out.println();
           System.out.println("USING ITERETOR");
           Iterator<String> s=name.iterator();
           while(s.hasNext())
           {
        	   System.out.print(s.next()+"   ");
           }
           
           System.out.println();
           
        Set<Integer> number=new HashSet<Integer>();;
           
           number.add(125);
           number.add(1223);
           number.add(143);
           number.add(125);
           number.add(125);
           number.add(125);
           Iterator<Integer> ss=number.iterator();
           while(ss.hasNext())
           {
        	   System.out.println(ss.next());
           }
	}

}
