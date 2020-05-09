

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\naveen.n\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.findElement(By.id("draggable"));
		Actions a = new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Target);
		a.build().perform();
		driver.switchTo().defaultContent();
		
	}

}
