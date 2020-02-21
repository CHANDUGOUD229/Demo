package array;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		
		Object a[][]=new Object[4][5];
		a[0][0]=100;
		a[0][1]="chandu";
		a[0][2]='c';
		a[0][4]=true;
		a[1][0]=100;
		a[1][1]=false;
		
		a[1][4]=100;
		a[2][2]=50.0;
		a[2][4]=100;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				
			if(i==1&&j==1)
			{
				System.out.println(a[i][j]);
			}
			}
		}
		
		
		
		
		
		
		

	}

}
