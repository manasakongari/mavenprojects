package mavenproject.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.orangehrm.com/en/book-a-free-demo/";
		Driver.get(url);
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.findElement(By.id("Form_getForm_FullName")).sendKeys("manasa");
		Driver.findElement(By.id("Form_getForm_Email")).sendKeys("manasa@gmail.com");
		Driver.findElement(By.name("CompanyName")).sendKeys("manasagroups");
	}

}
