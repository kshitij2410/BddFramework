package scenarion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestions {
public static void main(String...args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	Thread.sleep(3000);
	List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	ele.size();
	
	for(int i=0;i<ele.size();i++) {
		String text=ele.get(i).getText();
		System.out.println(text);
		if(text.equals("selenium rc")) {
			ele.get(i).click();
			break;
		}
	}
	Thread.sleep(2000);
	driver.quit();
}
}
