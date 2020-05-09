

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\naveen.n\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.espncricinfo.com/series/11132/scorecard/1185281/sudur-paschim-province-vs-gandaki-province-group-a-prime-minister-cup-2019");
		
		WebElement table=driver.findElement(By.xpath("//div[contains(@class,'col-b')]//div[4]//article[1]"));
		int row = table.findElements(By.cssSelector("div[class='wrap batsmen']")).size();
		System.out.println(row);
		//System.out.println(table.findElement(By.cssSelector("div[class='wrap batsmen']")).getText());
		int count = table.findElements(By.cssSelector("div[class='wrap batsmen] div:nth-child(3)")).size();
	
		
		
		for (int i =0; i<count;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='wrap batsmen] div:nth-child(3)")).get(i).getText());
						
		}
		
		
		driver.quit();

	}

}
