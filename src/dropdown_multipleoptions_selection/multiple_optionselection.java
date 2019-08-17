package dropdown_multipleoptions_selection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_optionselection {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		Boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("dropdown multiple selection state is =>"+flag);
		
		((JavascriptExecutor)driver).executeScript("document.getelementbyid"+"('open_account').setattribute('multiple','multiple')");
		
		Thread.sleep(5000);
		
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("dropdown multiple seletion state is=>"+flag1);
		
		if (flag1==true) 
		{
			Select openaccount=new Select(driver.findElement(By.id("open_account")));
			openaccount.deselectAll();
			openaccount.selectByIndex(1);
			openaccount.selectByIndex(3);
			openaccount.selectByIndex(5);
		}
	
		else
		{
			System.out.println("dropdown is a single option selection type");
		}
		
		
		
		
		
		
		
		
		
	

	}

}
