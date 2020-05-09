import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Seleniumbasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		/*driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		// driver.navigate().to("https://www.wikipedia.org/");
		// driver.navigate().back();
		// driver.navigate().forward();
		// Thread.sleep(2000);
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("corona");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		 * driver.get("https://www.instagram.com/"); Thread.sleep(3000);
		 * //driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 * //driver.findElement(By.xpath("//input[contains(@name,'username')]")).
		 * sendKeys("Naveen");
		 * driver.findElement(By.name("username")).sendKeys("Naveen");
		 * 
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
		 * "Sagar2222");
		 * 
		 * driver.findElement(By.xpath("//body//div[4]")).click();
		 * System.out.println(driver.getTitle());
		 * driver.navigate().to("https://www.google.co.in/");
		 * driver.findElement(By.xpath("//div[@class='gb_ge gb_i gb_Fg gb_wg']/div[2]/a"
		 * )).click();
		 
		driver.navigate().to("https://www.covid19india.org/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Karnataka')]")).click();

		// driver.findElement(By.xpath("//tbody[1]//tr[1]//td[1]//div[1]//span[1]//*[local-name()='svg']")).click();
		// driver.findElement(By.xpath("//tbody[1]//tr[1]//td[1]//div[1]//span[1]//*[local-name()='svg']")).click();
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[87]/td[1]/div[1]/span[1]/*[local-name()='svg'][1]")).click();
		driver.findElement(By.xpath("//tr[49]//td[1]//div[1]//span[1]//*[local-name()='svg']")).click();
		System.out.println("Tamilnadu clicked");
		String element = driver
				.findElement(
						By.xpath("//tr[49]//td[1]//div[1]//span[1]//*[local-name()='svg']/parent::span/parent::div"))
				.getText();
		System.out.println(element);
		driver.findElement((By.xpath("//div[@class='navbar-middle']/following-sibling::div"))).click();
		// driver.findElement(By.className("navbar-right")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/links']")).click();
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(3000);

		// driver.findElement(By.xpath("//div[6]//a[1]")).click();
		// System.out.println(driver.getTitle());

		driver.navigate().back();
		// driver.navigate().to("https://www.snapdeal.com/");
		// driver.findElement(By.cssSelector("#inputValEnter")).sendKeys("Cars");
		// driver.findElement(By.cssSelector("#inputValEnter")).sendKeys(Keys.ENTER);
*/		
		driver.navigate().to("https://www.easemytrip.com/");
		driver.findElement(By.xpath("//a[@class='dropbtn_n9']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@class='dropbtn_n9']")).getText());

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@id='myDropdown_n']//input[@class='plus_box1']")).click();

		}

		System.out.println(driver.findElement(By.xpath("//a[@class='dropbtn_n9']")).getText());

		driver.findElement(By.xpath("//a[@id='traveLer']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
		driver.findElement(By.xpath("//div[@id='fromautoFill']//li[2]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='FromSector_show']")).getText());

		//System.out.println(driver.findElement(By.xpath("//div[@id='fromautoFill']//li[2]")).getText());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Editbox13_show']")).click();

		
		driver.findElement(By.xpath("//div[@id='toautoFill']//li[6]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='toautoFill']//li[6]")).getText());
		System.out.println(driver.getTitle());

		
		WebElement source = driver.findElement(By.xpath("//input[@id='FromSector_show']"));
		source.clear();
		System.out.println("enetering chen");
		source.clear();

		source.sendKeys("chen");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);

		source.sendKeys(Keys.ARROW_DOWN);
		//source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement Destination = driver.findElement(By.xpath("//input[@id='Editbox13_show']"));
		Destination.clear();
		Destination.sendKeys("del");
		Thread.sleep(2000);

		Destination.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);

		Destination.sendKeys(Keys.ARROW_DOWN);
		Destination.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//li[@id='fiv_3_29/04/2020']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='checkmark']")).isSelected());

		driver.findElement(By.xpath("//span[@class='checkmark']")).click(); 
		Assert.assertFalse(driver.findElement(By.xpath("//span[@class='checkmark']")).isSelected());

		System.out.println(driver.findElement(By.xpath("//span[@class='checkmark']")).isSelected());

		

		

		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		//driver.findElement(By.xpath("//label[@for='four']")).click();
		int  count = driver.findElements(By.xpath("//input[@name='sample']")).size();		
		for (int i =0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//input[@name='sample']")).get(i).getAttribute("id");
			
			if(text.equals("four"))

			 {

				driver.findElements(By.xpath("//input[@name='sample']")).get(i).click();

			 }

		}
		
		
	/*	driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(3000);

		//driver.switchTo().alert().sendKeys("fesfe");

		driver.switchTo().alert().accept(); //Accept = ok done yes

		//driver.switchTo().alert().dismiss(); 
		
		
		//driver.quit();
*/
	}

}
