package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Dashboard 
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
	 public void dashboardtest()
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("12345678");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
	 

	 WebDriverWait waitv = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/header/div/button")));
	 ele.click();
	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[1]/div[2]/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[2]/div[2]/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div/div/ul/a[1]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div/div/ul/a[2]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[3]/div[2]/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[4]/div[2]/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div[2]/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[2]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[3]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[4]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[5]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[6]/div/h6")).click();
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[7]/div/h6")).click();
	 
	 
	 
	  }

	//@Test
	// public void mhtest() 
	//{
		//WebDriverWait waitv = new WebDriverWait(driver,Duration.ofSeconds(30));
		// WebElement ele = waitv.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/header/div/button")));
		 //ele.click();
		
	//}
	
}
