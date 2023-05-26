package ScrollUpDown;

import java.sql.Driver;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ScrollUpDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		
		//scroll UP
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
		Thread.sleep(2000);
		
		// scroll right
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
		Thread.sleep(2000);
		
		//scroll left
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,0)");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
	}

}
