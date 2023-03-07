package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript2 {
	
	 WebDriver driver; 
	 @Test

	 public void testAmazon()
	 {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in");
       driver.close();
	 }
	 
	 @Test
	 public void test1() {
		 Reporter.log("Hello World",true);
	 }
	 
	 @Test
	 public void test2()
	 {
		 Reporter.log("Just a Message",true);
	 }
	}


