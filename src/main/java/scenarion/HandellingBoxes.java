package scenarion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandellingBoxes {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(2000);
		List<WebElement> apps=driver.findElements(By.xpath("//ul[@class='LVal7b u4RcUd']/li"));
		for(int i=0;i<apps.size();i++) {
			String text=apps.get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Play")) {
				apps.get(i).click();
				break;
			}
		}
		driver.quit();
	}

}
