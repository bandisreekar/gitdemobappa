import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Ganeshatcone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(1000L);
		
		WebElement staticdropdown = (driver.findElement(By.id("Adults")));
		
		Select dropdown = new Select(staticdropdown);
		
		dropdown.selectByIndex(5);
		
		
		
		WebElement staticdropdown1 = (driver.findElement(By.id("Childrens")));
		
		Select dropdown1 = new Select(staticdropdown1);
		
		dropdown1.selectByIndex(2);
		
		
		
		WebElement staticdropdown2 = (driver.findElement(By.id("Infants")));
		
		Select dropdown2 = new Select(staticdropdown2);
		
		dropdown2.selectByIndex(4);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("SearchBtn")).click();
		
		
				
		driver.quit();
		
		
		
		
		
		/*Assignment 1
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click(); // to select the checkbox
		
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click(); // to unselect the checkbox
		
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // since type is common everywhere, used type. */
		
		
		
		
		//driver.quit();
		
		
	}

}
