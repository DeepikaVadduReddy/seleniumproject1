package testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();		
		cd.get("https://www.saucedemo.com/");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		cd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		cd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		cd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
	}

}
