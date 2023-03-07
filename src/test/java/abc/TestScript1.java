package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1 {
	
	@Test
	public void testSauceLogin() throws InterruptedException
	{
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.saucedemo.com");	   	
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");	    
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();	
			String expTitle="Swag Labs";
			String actTitle=driver.getTitle();	
			if(expTitle.equals(actTitle))
			{
				//Assert.assertTrue(true);
				
			}
			else
			{
				//Assert.assertTrue(false);
				driver.close();
					
			}
			driver.close();
			
		
	}

}
