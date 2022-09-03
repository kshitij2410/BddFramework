package scenarion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlight {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').setAttribute('style','border:4px solid red; background:green');");
		js.executeScript("arguments[0].setAttribute('style','border:4px solid red; background:green');",element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style','border:; background:');",element);//for removing highlight
		Thread.sleep(3000);
		driver.quit();
	}

}
