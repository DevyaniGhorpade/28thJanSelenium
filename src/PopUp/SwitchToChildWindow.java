package PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on New Tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window ID
		Set<String> allID = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(allID);
		
		String childwindowID = al.get(1);
		
		//switch to child window
		driver.switchTo().window(childwindowID);
		
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
		
	}
}
