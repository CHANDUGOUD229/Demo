package selenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTets {

	public static void main(String[] args) 
	{
		String appdate="18/December/2019";
		String[] temp=appdate.split("/");
		String dt= temp[0];
		String month=temp[1];
		String year=temp[2];
		
		String calyear,calmonth,caldt;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ojt4oclock\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();			
		}
		
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();		
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		//Code to select date from table
		
		WebElement cal=driver.findElement(By.className("calendar"));
		
		java.util.List<WebElement> rows,cols;		
		rows=cal.findElements(By.tagName("tr"));
		boolean flag=false;
		
		
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(dt))
				{
					cols.get(j).click();
					flag=true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
			
		}

	}

}
