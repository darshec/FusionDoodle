package fusiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageOperations {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		//to open website
		String url = "";
		driver.get(url);
		
		//Image identification
		WebElement i = driver.findElement(By.xpath(""));
		
		//to check image
		Boolean p = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
		
		if(p) {
			System.out.println("Image is present");
			
		}else {
			System.out.println("Image is not present");
		}
		driver.quit();
	}

}
