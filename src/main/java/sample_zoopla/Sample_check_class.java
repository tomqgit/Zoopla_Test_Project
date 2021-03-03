package sample_zoopla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_check_class {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Zoopla_Test_Project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://zoopla.co.uk");
//	String parent = driver.getWindowHandle();
//	System.out.println(parent);
//	Set <String> allWindows = driver.getWindowHandles();
//	int count = allWindows.size();
//	System.out.println(count);
//	for(String child:allWindows)
//	{
//		driver.switchTo().window(child);
//		String childWindowID = driver.getWindowHandle();
//		System.out.println(childWindowID);
//	}
	//driver.switchTo().frame("cs-native-frame");
	
	List <WebElement> ListOfButtons = driver.findElements(By.tagName("button"));
	for(WebElement ButtonNames:ListOfButtons)
		{
		 System.out.println(ButtonNames.getText());
		}
	
	
	//driver.findElement(By.xpath("//button[@class='ui-button-primary']")).click();
	//driver.findElement(By.linkText("Accept all cookies")).click();
	
	// Should I introduce a check that only if this cookies request appears we should click on it
	driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
	
	
	
	driver.findElement(By.id("search-input-location")).sendKeys("London");
	driver.findElement(By.id("search-submit")).click();
	
	List<WebElement> Price_List = driver.findElements(By.xpath("//p[@class='css-18tfumg-Text eczcs4p0']"));
	
	ArrayList <String> Price_List_Actual_Numbers = new ArrayList <String> ();
	
	
	for(WebElement Price_List_Numbers:Price_List) {
		
		String Price_List_Numbers_Values = Price_List_Numbers.getText();
		System.out.println(Price_List_Numbers_Values);
		
		Price_List_Actual_Numbers.add(Price_List_Numbers_Values);
	}
	
	Collections.sort(Price_List_Actual_Numbers);
	System.out.println(Price_List_Actual_Numbers);
	
	//driver.close();
	
	

	}

}
