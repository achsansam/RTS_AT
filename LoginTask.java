package cmpnyTask_Pkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTask
{
	
	 WebDriver driver;
	 @BeforeTest 
 	public void setup()
 	{
 		driver =new ChromeDriver();
 	}
	 
	 @BeforeMethod()
	 public void url()
	 {
		 driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		 driver.manage().window().maximize(); 
	 }
	
	
	 
	 @Test
	 public void test1()
	  {
		 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	 
	  }
	 
	 @Test
	  public void test2()
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("12345678");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	  }
 
	 

}
