package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPageFromFRame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		//switch to frame
		
		driver.switchTo().frame("iframeresult");
		
		//click on click me button from iframe
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//click on open menu option
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}

}
