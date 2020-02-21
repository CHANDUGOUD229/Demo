package array;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetsss {

	public static void main(String[] args)
	{
    HashSet<String> ss=new HashSet<String>();
    ss.add("chandu");
    ss.add("chandu");
    ss.add("df"); 
    ss.add("ff");
    ss.add("dd");
     Iterator<String> str=ss.iterator();
     while(str.hasNext())
     {
    	 System.out.println(str.next());
     }
     
	}

}
