import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaBasics {
	// all the code will be written inside a class, here we created the class name
	// as JavaBasics

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//program starts from here

		System.out.println("Ganapathi Bappa morya");

		int a = 50;
		int b = 15;
		int sum = a + b;

		// System.out.println("My sum is " + sum);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://google.com"); //will get you the google page launched
		// System.out.println(driver.getTitle()); // will print the title in google
		// System.out.println(driver.getCurrentUrl()); // will print the current url in
		// google
		// System.out.println(driver.getPageSource()); // will the print the pagesource
		// on google.com
		// driver.quit(); // will close all the tabs in chrome browser.

		// driver.get("https://gmail.com");
		// driver.navigate().back();
		// driver.get("https://google.com");

		driver.manage().window().maximize();
		// driver.get("https://facebook.com");
		// driver.findElement(By.id("email")).sendKeys("bappamorya");
		// driver.findElement(By.name("pass")).sendKeys("hellobappaji");
		// driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();
		// driver.findElement(By.name("login")).click();
		// driver.navigate().back();
		// driver.close();

		// driver.get("https://login.salesforce.com/");
		// driver.findElement(By.id("username")).sendKeys("hellobappaji");
		// driver.findElement(By.name("pw")).sendKeys("12345");
		// driver.findElement(By.id("Login")).click();
		// System.out.println(driver.findElement(By.id("error")).getText());

		// in order to check whether xpath of locator is correct, in console of inspect
		// element write below: $x(" ")
		// in order to check css of locator is correct, in console of inspect element
		// write below: $(" ")

		// **********************************************************************************************************
		// //

		// 1. for xpath to find attributes: //tagName[@attribute='value'] (or)
		// //*[@attribute='value']
		// 2. for css to find attributes: tagName[attribute='value'] (or)
		// [attribute='value']
		// 3. css with the help of ID: tagName#id (or) #id (or) tagName.classname

		// *************************************************************************************************************//

		// Regular expression, when the attribute value is too big or changing:

		// 4. for xpath: //tagName[contains(@attribute, 'value')]
		// 5. for css: tagName[attribute*='value']

		// driver.get("https://facebook.com");
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("heythere"); //
		// refer #1 from above
		// driver.findElement(By.cssSelector("[id='pass']")).sendKeys("bappamorya"); //
		// refer #2 from above
		// driver.findElement(By.xpath("//button[contains(@class,'selected')]")).click();
		// // refer //4 from above, when no tagName is given, pick the first word of the
		// column while inspecting.make sure of () n ;
		// driver.findElement(By.cssSelector("a[class*='_97w4']")).click();

		// driver.get("https://login.salesforce.com/?locale=ca");
		// driver.findElement(By.cssSelector("input#username")).sendKeys("hellobappa");
		// // refer #3 from above
		// driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("mangalmurthi");
		// driver.findElement(By.cssSelector("input[value='Log In']")).click(); // refer
		// #5 from above
		// driver.findElement(By.xpath("//a[contains(@id,'forgot')]")).click(); // refer
		// #4 from above
		// driver.findElement(By.name("un")).sendKeys("you are good now");

		/*
		 * driver.get("https://rediff.com");
		 * driver.findElement(By.className("signin")).click();
		 * driver.findElement(By.id("login1")).sendKeys("hellobappaji");
		 * driver.findElement(By.name("passwd")).sendKeys("bappamorya");
		 * driver.findElement(By.xpath("//input[@title='Sign in']")).click(); // refer
		 * #1 driver.findElement(By.xpath("//a[contains(@href,'newforgot')]")).click();
		 * // with href, refer #4
		 * driver.findElement(By.xpath("//input[@class='rTextfield']")).sendKeys(
		 * "heybappa"); // refer #4
		 * driver.findElement(By.cssSelector("input[value='Next >']")).click();
		 * 
		 * driver.get("https://google.com");
		 * driver.findElement(By.xpath("//div[@class='gb_ae gb_i gb_xg gb_og']/div[2]/a"
		 * )).click();
		 */

		// flight bookings rahul shetty

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// dropdown with select tag

		driver.quit();

		// driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		// driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("heyyoumaeit");
		// driver.findElement(By.xpath("//*[@type='button']")).click();
		// driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("heythere");
		// driver.findElement(By.cssSelector("#queryPhoneNext > div > button >
		// div.VfPpkd-RLmnJb")).click();

		// driver.quit();

	}

}

// any code will be not executed if we write here.