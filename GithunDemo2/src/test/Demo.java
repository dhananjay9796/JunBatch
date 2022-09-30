package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) 
	{
		Property_Reader p=new Property_Reader();
		System.out.println("hello World");
		
		System.setProperty(p.getChromeKey(),p.getChromePath());
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement curAdd=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		curAdd.sendKeys("Uruli Kanchan, Pune");
		
		
		
	}
}
