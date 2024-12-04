package mavenproject.mavenproject1;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/delete_customer.php";
		Driver.get(url);
		
		Driver.findElement(By.xpath("//input[@name=\"cusid\"]")).click();
		Driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Alert alert = Driver.switchTo().alert();
		alert.dismiss();
		

	}

}
