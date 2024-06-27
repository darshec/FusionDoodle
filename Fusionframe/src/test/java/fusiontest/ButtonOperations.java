package fusiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonOperations {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
			//to open website
			driver.get("");
			
			//Locate button using xpath
			WebElement button = driver.findElement(By.xpath(""));
			
			if(button.isEnabled()) {
				button.click();
				System.out.println("Button is enabled");
			}else {
				System.out.println("Button is disabled");
			}
			
			driver.quit();
			
		}

	}


