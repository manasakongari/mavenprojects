package mavenproject.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		Driver.get(url);
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.findElement(By.linkText("Best Sellers")).click();

	}

}
