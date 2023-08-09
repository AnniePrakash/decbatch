package Base;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException  {
		
		//To configure the browser
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumAprBatch\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//To launch the URL
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor jk=(JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		
		WebElement textUser = driver.findElement(By.id("email"));
		
		
		jk.executeScript("arguments[0].setAttribute('value','Hanno', textUser)");
		
		
		
		
		
		
		
		
		
	}

}
