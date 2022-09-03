package scenarion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByJavascript {
	public static void main(String...args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/");
	WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Apache POI')])[2]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollTo(0,1000)");
//	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	//js.executeScript("window.scrollBy(0,1000)");
	js.executeScript("arguments[0].scrollIntoView()",element);
	js.executeScript("arguments[0].setAttribute('style','border:4px solid red; background:');",element);
	Thread.sleep(2000);
	driver.quit();
	}
}
