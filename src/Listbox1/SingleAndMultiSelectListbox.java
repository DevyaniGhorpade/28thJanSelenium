package Listbox1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleAndMultiSelectListbox 
{
	public static void main(String[] args) 
	{
	       //is multiselectable listbox or singleselectable
		 
            WebDriver driver=new ChromeDriver();	
	        driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();
			
			WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
		
			Select s=new Select(cars);
		
		    boolean result = s.isMultiple();
		    System.out.println(result);
		
		    if(result)
		    {
			    System.out.println("Listbox is multiselectable");
		    }
		    else
		    {
			    System.out.println("Listbox is single selectable");
		    }
		
		
//		int size = s.getOptions().size();
//		System.out.println(size);
//		
//		List<WebElement> getoption = s.getOptions();
//		System.out.println(getoption.size());
//		
//		for(WebElement s1:getoption)
//		{
//			System.out.println(s1.getText());
//		}
//	
		
		
	}

}
