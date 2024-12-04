package mavenproject.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.orangehrm.com/en/contact-sales/";
		Driver.get(url);
		Driver.findElement(By.xpath("//input[@id=\"Form_getForm_FullName\"]")).sendKeys("manasa");
		Driver.findElement(By.xpath("//input[@id=\"Form_getForm_Contact\"]")).sendKeys("12345");
		Driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("manu@gmail.com");
		Driver.findElement(By.xpath("//input[@name=\"JobTitle\"]")).sendKeys("test engineer");
		Driver.findElement(By.xpath("//textarea[@id=\"Form_getForm_Comment\"]")).sendKeys("xyz");
		Driver.findElement(By.xpath("//input[@name=\"action_submitForm\"]"));
	}

}
