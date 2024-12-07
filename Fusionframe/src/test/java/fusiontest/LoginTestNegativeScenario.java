package fusiontest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestNegativeScenario {

	public static void main(String[] args) {
		
		// To invoke web browser
		WebDriver driver = new ChromeDriver();
		
		//Wait mechanism. Will tell the browser to wait for declared number to seconds when required element is not found
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// To pass the url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// Inserting username using id locator
		driver.findElement(By.id("inputUsername")).sendKeys("Darshan");
		
		// Inserting password using name locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		// Submit Login details using classname locator
		driver.findElement(By.className("signInBtn")).click();
		
		// To read and get the error text using cssSelector locator	
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

	}

}
