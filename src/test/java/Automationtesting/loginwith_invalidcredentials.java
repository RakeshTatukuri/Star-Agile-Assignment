package Automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwith_invalidcredentials {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//signin
		driver.findElement(By.linkText("Sign in")).click();
		//valid email or mobile number
		driver.findElement(By.xpath("//input[@aria-describedby=\"Enter your email or mobile phone number\"]")).sendKeys("rakesh.tatukuri179@gmail.com");
		//continue
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//invalid password
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rakesh");
		//signin button
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
	
	}
}
