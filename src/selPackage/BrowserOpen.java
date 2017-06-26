package selPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpen {
	
	
	public static void main(String[] args){
	
		//Browser Launch
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Open the webPage
		//driver.get("http:\\seleniumhq.org");
		
		//Navigate
		driver.navigate().to("http:\\seleniumhq.org");
		
		//By Link Text
//		WebElement linkNew =driver.findElement(By.linkText("Projects"));
//		linkNew.click();
		
		//By Xpath
		WebElement XpathNew = driver.findElement(By.xpath("//*[@id='menu_projects']/a"));
		XpathNew.click();
		
		
		
	}

}
