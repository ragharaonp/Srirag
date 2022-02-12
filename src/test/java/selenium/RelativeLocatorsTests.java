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


public class RelativeLocatorsTests {
	@Test
	public static void main() {
		
		System.setProperty("webdriver.chrome.driver","D:/Softwares/Workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		System.out.println("Done");
		driver.quit();
    
	}
}