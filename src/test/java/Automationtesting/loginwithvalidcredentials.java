package Automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwithvalidcredentials {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//signin
		driver.findElement(By.linkText("Sign in")).click();
		//email or mobile number
		driver.findElement(By.xpath("//input[@aria-describedby=\"Enter your email or mobile phone number\"]")).sendKeys("9553438459");
		//continue
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//password
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rakesh");
		//note :  in above i entered the incorrect password for security reason
		//signin button
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
	
	}
}
