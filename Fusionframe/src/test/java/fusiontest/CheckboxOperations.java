package fusiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxOperations {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
				//Open the website
				driver.get("");
				
				//Locating checkbox
				WebElement checkbox1 = driver.findElement(By.id(""));
				
				//checking if checkbox is already selected and viceversa
				if(!checkbox1.isSelected()) {
					System.out.println("checkbox is already selected, so unchecking it");
					checkbox1.click();
				}
				else {
					System.out.println("checkbox is not selected, so selecting");
					checkbox1.click();
				}
			
		}finally {
			driver.close();
		}

	}

}
