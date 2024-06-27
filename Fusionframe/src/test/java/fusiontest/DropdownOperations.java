package fusiontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOperations {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		try {
			//to open website
			String url = "";
			driver.get(url);
			
			//locate dropdown
			WebElement dropdownElement1 = driver.findElement(By.id(""));
			
			//passing dropdownElement1 as an argument using Select class
			
			Select dropdown = new Select(dropdownElement1);
			
			//Select by visible text
			BufferedReader bfn = new BufferedReader(
		            new InputStreamReader(System.in));
			
			String Text = bfn.readLine();
			
			dropdown.selectByVisibleText(Text);
			System.out.println("Selected option by visible text:" +dropdown.getFirstSelectedOption().getText() );
			
			//Select by visible value
			String value = bfn.readLine();
			
			dropdown.selectByValue(value);
			System.out.println("Selected option by visible text:" +dropdown.getFirstSelectedOption().getText() );
			
			//Select by index
			
			int it = Integer.parseInt(bfn.readLine());
			
			dropdown.selectByIndex(it);
			System.out.println("Selected option by visible text:" +dropdown.getFirstSelectedOption().getText() );
			
			//Getting all options
			
			List<WebElement> alloptions = dropdown.getOptions();
			System.out.println("All the available options:");
			for(WebElement option:alloptions) {
				System.out.println(option.getText());
			}
			
		
			
		}finally {
			driver.quit();
		}
		
	}		
				

	}


