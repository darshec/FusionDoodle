package fusiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextOperations {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
			//Launch browser application (software) and get title of the application
			driver.get("");
			
			//Finding the link by its text
			WebElement LinkedText = driver.findElement(By.linkText(""));
			
			Thread.sleep(5000);
			
			//Finding the link by the partial text
			WebElement PartialLinkText = driver.findElement(By.partialLinkText(""));
			WebElement ExpectedText = PartialLinkText;
			WebElement ActualText = LinkedText;
			if(ExpectedText.equals(ActualText)) {
				System.out.println("Expected Text and Actual Text are matching....");
			} else {
				System.out.println("Expected Text is not matching with Actula Text");
			}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}


