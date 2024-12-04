package mavenproject.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.orangehrm.com/en/book-a-free-demo";
		Driver.get(url);
		Driver.findElement(By.xpath("//input[@name=\"FullName\"]")).sendKeys("manasa");
		Driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("manu@gmail.com");
		Driver.findElement(By.xpath("//input[@id=\"Form_getForm_CompanyName\"]")).sendKeys("abc");
		Driver.findElement(By.xpath("//input[@id=\"Form_getForm_Contact\"]")).sendKeys("12345");
		
		Driver.findElement(By.xpath("//input[@id=\"Form_getForm_action_submitForm\"]"));
	}

}
