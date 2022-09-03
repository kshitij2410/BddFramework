package scenarion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptClick {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('femalerb').click()");
		List checkboxes=(List)js.executeScript("return document.getElementsByName('language')");
		for(Object object:checkboxes) {
			js.executeScript("arguments[0].click()",object);
		}
		js.executeScript("document.getElementById('registerbtn').click()");
		Thread.sleep(5000);
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Click here to navigate to the home page')]"));
		js.executeScript("arguments[0].click()",link);
		driver.quit();
	}

}
