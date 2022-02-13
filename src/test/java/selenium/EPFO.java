package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.Property;


public class EPFO {
	@Test
	public static void main() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:/Softwares/Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Property p = new Property();
		String url = p.getProperty("epfoURL");
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("100290265779");
		Thread.sleep(5000);
	}
}