import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class ConsoleLogsCapture {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//generally used with Listeners-OnTestFailure() method
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.linkText("Appium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
		
		LogEntries entry=driver.manage().logs().get(LogType.BROWSER); //create logentry obj
		List<LogEntry> logs=entry.getAll();//get all logentries
		for(LogEntry e:logs) {
			System.out.println(e.getMessage()); //print the error message from browser
		}
		
		

	}

}
