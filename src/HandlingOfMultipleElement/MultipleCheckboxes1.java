package HandlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckboxes1 
{
    public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/MultipleCheckboxes.html");
		driver.manage().window().maximize();
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement s1:allcheckboxes)
		{
			s1.click();
			Thread.sleep(500);
		}
		
		for(int i=allcheckboxes.size()-1;i>=0;i--)
		{
		    allcheckboxes.get(i).click();
		    Thread.sleep(500);
		}
		
		driver.close();
	}
}
