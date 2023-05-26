package HandlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggecstion 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("samsung");
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		String ExpectedText = "samsung s22 ultra";
		
		for(WebElement s1:alloptions)
		{
				String actualtext = s1.getText();
				if(actualtext.equals(ExpectedText))
				{
					s1.click();
					break;
		        }
	     }

}
}
