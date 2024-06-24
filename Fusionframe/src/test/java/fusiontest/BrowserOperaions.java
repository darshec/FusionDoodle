package fusiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperaions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Launch browser application and get title of the application
		driver.get("");
		System.out.println("Title: " + driver.getTitle() );
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Navigate to other pages
		driver.navigate().to("");
		System.out.println("Title: " + driver.getTitle() );
		
		//Navigate to previous page
		driver.navigate().back();
		System.out.println("Title: " + driver.getTitle() );
		
		//Navigate to next page
		driver.navigate().forward();
		System.out.println("Title: " + driver.getTitle());
		
		//Refresh the browser
		driver.navigate().refresh();
		System.out.println("Title: " + driver.getTitle());
		
		//quit the browser
		driver.quit();

	}

}
