package ECommerce.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpStandAlone {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:3000/signup");
		
		//Verify SignUp logo is displayed
		System.out.println("SignUp Logo Displayed: "+driver.findElement(By.xpath("//img")).isDisplayed());
		
		//Enter First Name
		driver.findElement(By.id(":r1:")).sendKeys("Yug");
		
		//Enter last Name
		driver.findElement(By.id(":r3:")).sendKeys("S");
		
		//Enter Email ID
		driver.findElement(By.id(":r5:")).sendKeys("yug@yopmail.com");
				
		//Enter Phone Number
		driver.findElement(By.id(":r7:")).sendKeys("9999999999");
		
		//Gender dropdown
		WebElement dropdownbox=driver.findElement(By.cssSelector("[aria-haspopup='listbox']"));
		//click on dropdown
		dropdownbox.click();
		//select male
		driver.findElement(By.cssSelector("[data-value=\"Male\"]")).click();
		
		//calendar icon click
		driver.findElement(By.cssSelector("[aria-label=\"Choose date\"]")).click();
		
		//click on yeardropdown
		driver.findElement(By.cssSelector("button [data-testid=\"ArrowDropDownIcon\"]")).click();
		int yearcount=driver.findElements(By.cssSelector(".MuiPickersYear-root")).size();
		
		for (int i = 0; i < yearcount; i++)

		{

			//Thread.sleep(2000);

			String getYear = driver.findElements(By.cssSelector(".MuiPickersYear-root")).get(i).getText();

			if (getYear.equalsIgnoreCase("2013"))

			{

				driver.findElements(By.cssSelector(".MuiPickersYear-root")).get(i).click();

				System.out.println("The selected year is:" +getYear);

				break;

			}

		}
		
		while(!(driver.findElement(By.id(":rh:-grid-label")).getText().contains("October"))) {
			//Thread.sleep(2000);
			driver.findElement(By.cssSelector("[data-testid=\"ArrowRightIcon\"]")).click();
		}
		
	int dayCount=driver.findElements(By.cssSelector(".MuiPickersDay-root.MuiPickersDay-dayWithMargin ")).size();
		
		for (int i = 0; i < dayCount; i++)

		{

			//Thread.sleep(2000);

			String getDay = driver.findElements(By.cssSelector(".MuiPickersDay-root.MuiPickersDay-dayWithMargin ")).get(i).getText();

			if (getDay.equalsIgnoreCase("18"))

			{

				driver.findElements(By.cssSelector(".MuiPickersDay-root.MuiPickersDay-dayWithMargin ")).get(i).click();

				System.out.println("The selected Day is:" +getDay);

				break;

			}

		}
		
		String date = driver.findElement(By.id(":r9:")).getAttribute("value");

		System.out.println("The select date is:" + date);
				
		//Enter password and click on password eye (Pending)
		driver.findElement(By.id(":rd:")).sendKeys("qwer1234");
		//driver.findElement(By.className("css-8je8zh-MuiTouchRipple-root")).click();
		
		//Enter Confirm password and click on password eye (Pending)
		WebElement confirmPasswordfield=driver.findElement(By.id(":rf:")); 
		WebElement confirmPwdEyeIcon=driver.findElement(By.xpath("//*[@id=':rd:']/parent::div/child::div//button"));
		driver.findElement(By.id(":rf:")).sendKeys("qwer1234");
		String passwordType=driver.findElement(By.id(":rf:")).getAttribute("type");		
		boolean isVisibleCheck=passwordType.equalsIgnoreCase("text");
		
		confirmPwdEyeIcon.click();
		
		String updatedPasswordType=driver.findElement(By.id(":rf:")).getAttribute("type");		
		boolean isVisibleCheckUpdated=updatedPasswordType.equalsIgnoreCase("text");
		
		Assert.assertEquals(isVisibleCheckUpdated, isVisibleCheck);
		
		
		
		
		
		
		//Click on Terms and Condition checkbox to Accept 
		driver.findElement(By.cssSelector("[type=\"checkbox\"]")).click();
		
		//Click on Sign Up button
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='MuiAlert-message css-1pxa9xg-MuiAlert-message'])")).getText());
		
		
		
		
		
	}

	}


