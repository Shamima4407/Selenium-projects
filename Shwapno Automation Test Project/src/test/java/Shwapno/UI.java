package Shwapno;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UI {
	
	public static WebDriver driver;
	
	//code for opening chrome browser
	@Test
	public void setup() throws InterruptedException {
		//Coding for chrome browser opening
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP-NPC\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.shwapno.com/");
	    Thread.sleep(1000);
	    //Code for select the city 
	    Select city = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
	    city.selectByVisibleText("Dhaka");
	    //Code for select the area 
	    Select area = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
	    area.selectByVisibleText("Lalbagh");
	    //Code for click the submit button
	    driver.findElement(By.id("btnFindStore")).click();
	    Thread.sleep(5000);
	    
	    //Code for adding product in the cart
	    driver.findElement(By.xpath("//div[@class='bucket_left']/a/img")).click();
	    driver.findElement(By.xpath("//*[@id=\"QuickAdd16777459\"]/a[3]")).click();
	    Thread.sleep(5000);
	    driver.close();
	}
}
