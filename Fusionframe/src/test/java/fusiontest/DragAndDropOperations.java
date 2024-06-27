package fusiontest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperations {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			//to open website
			String url = "";
			driver.get(url);
			
			//Switching to the frame containing drag and drop elements
			
			driver.switchTo().frame(driver.findElement(By.className("")));
			
			//Locating the dragging element
			
			WebElement Source = driver.findElement(By.id(""));
			
			//Locating the drop element
			
			WebElement Target = driver.findElement(By.id(""));
			
			Actions action = new Actions(driver);
			
			//perform drag and drop operation
			
			action.dragAndDrop(Source, Target).perform();
			Thread.sleep(5000);
			
			String Text = Target.getText();
			if(Text.equals("Dropped!")) {
				System.out.println("Drag and drop operation is successful");
			}else {
				System.out.println("Drag and drop operation failed");
			}
			
		}finally {
			driver.quit();
		}
		
		

	}

}
