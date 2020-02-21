package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) throws FileNotFoundException 
	{
		try{
			System.out.println(1/0);
		}catch(NullPointerException e)
		{
			System.out.println("Exection Completed");
		}finally
		{
			System.out.println("Program Completed");
		}
		
		FileInputStream s=new FileInputStream("d:chandu");
		
	}

}
