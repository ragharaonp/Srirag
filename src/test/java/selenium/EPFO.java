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


public class EPFO {
	@Test
	public static void main() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:/Softwares/Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("100290265779");
		driver.findElement(By.id("password")).sendKeys("F0906ucsa0906@");
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(5000);
	}
}