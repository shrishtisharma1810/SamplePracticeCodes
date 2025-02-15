import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		//establish connection on localhost on port no 3306 to connect with Qadbt database 
		//with username root and pwd Root2123
		Connection conn=DriverManager.getConnection("jdbc:mysql://" +host+ ":" +port+ "/qadbt", "root", "Root@123");
		
		//with that connection create statement
		Statement s=conn.createStatement();
		
		//create result set to hold output of query 
		ResultSet rs=s.executeQuery("select *from Employeeinfo where name=\"ram\";");
		
		//rs points to row header by default
		//rs.next will point to actual row content  
		while(rs.next())
		{
		//display location age and id of that row
		//System.out.println(rs.getString("location"));
		//System.out.println(rs.getInt("age"));
		//System.out.println(rs.getInt("id"));
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(rs.getString("location"));
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(rs.getString("name"));
		}
	}

}
