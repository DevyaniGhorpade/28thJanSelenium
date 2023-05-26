package PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPage_FromChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on New Tab from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        
      //get child window ID
      Set<String> allID = driver.getWindowHandles();  //main page ID,Child windOW ID
      		
      ArrayList<String> al=new ArrayList<String>(allID);   //main page ID(0),Child windOW ID(1)
      

		//switch to child window
		driver.switchTo().window(al.get(1));   //Strign child window ID
		
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
		Thread.sleep(3000);
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
