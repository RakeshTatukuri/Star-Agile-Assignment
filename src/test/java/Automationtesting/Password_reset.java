package Automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Password_reset {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//signin
		driver.findElement(By.linkText("Sign in")).click();
		//valid email or mobile number
		driver.findElement(By.xpath("//input[@aria-describedby=\"Enter your email or mobile phone number\"]")).sendKeys("9553438459");
		//continue
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//forget password
		driver.findElement(By.xpath("(//a[normalize-space()='Forgot Password'])[1]")).click();
		//valid mobile number
		driver.findElement(By.xpath("//input[@value=\"+919553438459\"]"));
		//continue button
		driver.findElement(By.id("continue")).click();
		//After clicking continue button here we enter the otp 
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("543234");
		//continue button
		driver.findElement(By.xpath("(//input[@aria-label='Verify OTP Button'])[1]")).click();
	   //after these otp we need to reset password for twice in these scenario  here we cannot proceed futher because the otp is chainging every time
	   //new password
	    driver.findElement(By.name("password")).sendKeys("R@keshtatuk");
		//password again
		driver.findElement(By.name("passwordCheck")).sendKeys("R@keshtatuk");
		//save changes and sign in
		driver.findElement(By.id("Save changes and sign in")).click();
	}
}
