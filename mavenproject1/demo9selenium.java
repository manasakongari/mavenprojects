package mavenproject.mavenproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		Driver.get(url);
		Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Driver.findElement(By.xpath("//input[@name=\"dropdown-selection\"]")).clear();
		Driver.findElement(By.xpath("//input[@name=\"dropdown-selection\"]")).sendKeys("iphone 16");
		
		Driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
	}

}
