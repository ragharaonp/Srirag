package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleDemo {
	static WebDriver driver;
	public static void main(String args[]) {
		try {
			driver = new ChromeDriver();
			driver.get("https://www.google.in");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}
}
